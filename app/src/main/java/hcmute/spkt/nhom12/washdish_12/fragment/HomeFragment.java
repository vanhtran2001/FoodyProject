package hcmute.spkt.nhom12.washdish_12.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Locale;

import hcmute.spkt.nhom12.washdish_12.model.CuaHangItem;
import hcmute.spkt.nhom12.washdish_12.R;
import hcmute.spkt.nhom12.washdish_12.adapter.CuaHangAdapter;
import hcmute.spkt.nhom12.washdish_12.dao.CuaHangDAO;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    ListView listView;
    CuaHangAdapter adapter;
    ArrayList<CuaHangItem> mangCuaHang;
    CuaHangDAO dao;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
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
    /*private void filter(String text) {
        ArrayList<CuaHangItem> fileredList = new ArrayList<>();

        for(CuaHangItem cuaHangItem : mangCuaHang) {
            if (cuaHangItem.getNameCuaHang().toLowerCase(Locale.ROOT).contains(text.toLowerCase(Locale.ROOT))) {
                fileredList.add(cuaHangItem);
            }
        }

        adapter.filterList(fileredList);
    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        dao = new CuaHangDAO(getActivity());
        mangCuaHang = dao.getAll();
        listView = (ListView) root.findViewById(R.id.listviewCuaHang);
        adapter = new CuaHangAdapter(getActivity(),mangCuaHang);
        listView.setAdapter(adapter);

        EditText editText = (EditText) root.findViewById(R.id.edittextSearch);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                filter(editable.toString());
            }
        });

        return root;
    }
    private void filter(String text){
        ArrayList<CuaHangItem> list = new ArrayList<>();

        for (CuaHangItem item : mangCuaHang) {
            if (item.getNameCuaHang().toLowerCase(Locale.ROOT).contains(text.toLowerCase(Locale.ROOT))){
                list.add(item);
            }
        }
        adapter.filterList(list);
    }
}