package hcmute.spkt.nhom12.washdish_12.fragment;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import hcmute.spkt.nhom12.washdish_12.database.Database;
import hcmute.spkt.nhom12.washdish_12.R;
import hcmute.spkt.nhom12.washdish_12.activity.SignInActivity;
import hcmute.spkt.nhom12.washdish_12.model.UserItem;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AccountFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AccountFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private EditText edtEmail, edtPassword, edtFname, edtPhone, edtAddress;
    private Button btnUpdate, btnLogout;
    private UserItem user;

    public AccountFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AccountFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AccountFragment newInstance(String param1, String param2) {
        AccountFragment fragment = new AccountFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_account, container, false);

        edtEmail = (EditText)root.findViewById(R.id.edittextEmailAccount);
        edtPassword = (EditText)root.findViewById(R.id.edittextPasswordAccount);
        edtFname = (EditText)root.findViewById(R.id.edittextNameAccount);
        edtPhone = (EditText)root.findViewById(R.id.edittextPhoneAccount);
        edtAddress = (EditText)root.findViewById(R.id.edittextAddressAccount);
        btnUpdate = (Button)root.findViewById(R.id.buttonUpdate);
        btnLogout = (Button) root.findViewById(R.id.buttonLogOut);
        edtEmail.setEnabled(false);
        loadData();
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), SignInActivity.class);
                startActivity(intent);
            }
        });

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Database database = new Database(getActivity().getApplicationContext());
                    UserItem curentUser = database.find(user.getId());
                    curentUser.setPassword(edtPassword.getText().toString());
                    curentUser.setFname(edtFname.getText().toString());
                    curentUser.setPhone(edtPhone.getText().toString());
                    curentUser.setAdrs(edtAddress.getText().toString());
                    if(database.suaUser(curentUser)) {
                        Intent intent = new Intent();
                        intent.setClass(getActivity(),SignInActivity.class);
                        intent.putExtra("account", curentUser);
                        AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                        builder.setMessage("Cập nhật thông tin thành công. Vui lòng đăng nhập lại!");
                        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                                startActivity(intent);
                            }
                        });
                        builder.show();
                    }else {
                        AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                        builder.setMessage("Cập nhật thông tin thất bại!");
                        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });
                        builder.show();
                    }
                } catch (Exception e){
                    AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                    builder.setMessage(e.getMessage());
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                        }
                    });
                    builder.show();
                }
            }
        });

        return root;
    }

    private void loadData(){
        Intent intent = getActivity().getIntent();
        user = (UserItem) intent.getSerializableExtra("account");
        edtEmail.setText(user.getEmail());
        edtPassword.setText(user.getPassword());
        edtFname.setText(user.getFname());
        edtPhone.setText(user.getPhone());
        edtAddress.setText(user.getAdrs());
    }
}