package hcmute.spkt.nhom12.washdish_12.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import hcmute.spkt.nhom12.washdish_12.R;
import hcmute.spkt.nhom12.washdish_12.adapter.OrderAdapter;
import hcmute.spkt.nhom12.washdish_12.dao.OrderDAO;
import hcmute.spkt.nhom12.washdish_12.database.Database;
import hcmute.spkt.nhom12.washdish_12.global.Global;
import hcmute.spkt.nhom12.washdish_12.model.OrderItem;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link OrderFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OrderFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    ListView lvOrder;
    OrderAdapter adapter;
    ArrayList<OrderItem> listOrder;
    OrderDAO orderDAO;


    public OrderFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment OrderFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static OrderFragment newInstance(String param1, String param2) {
        OrderFragment fragment = new OrderFragment();
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
        View root = inflater.inflate(R.layout.fragment_order, container, false);
        listOrder = new ArrayList<>();
        orderDAO = new OrderDAO(getContext());
        int idUser = Global.getId();
        listOrder = orderDAO.getAllOrderById(idUser);
        lvOrder = (ListView) root.findViewById(R.id.listviewOrder);
        adapter = new OrderAdapter(getContext(),listOrder);
        lvOrder.setAdapter(adapter);


        return root;
    }
}