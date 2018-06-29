
package com.example.uday.roomdatabaseex;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class HomeFragment extends Fragment implements View.OnClickListener {


    private Button btnAddUser,btnReadUser,btnDeleteUser,btnUpdateUser;

    public HomeFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        btnAddUser = (Button)view.findViewById(R.id.btnh_add);
        btnAddUser.setOnClickListener(this);

        btnReadUser = (Button)view.findViewById(R.id.btn_view);
        btnReadUser.setOnClickListener(this);

        btnDeleteUser = (Button)view.findViewById(R.id.btn_delete);
        btnDeleteUser.setOnClickListener(this);

        btnUpdateUser = (Button)view.findViewById(R.id.btn_update);
        btnUpdateUser.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnh_add :
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragmentContainer,new AddUserFragment())
                        .addToBackStack(null).commit();
                break;
            case R.id.btn_view:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragmentContainer,new ReadUserFragment())
                        .addToBackStack(null).commit();
                break;
            case R.id.btn_delete:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragmentContainer,new DeleteUserFragment())
                        .addToBackStack(null).commit();
                break;
            case R.id.btn_update:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragmentContainer,new UpdateUserFragment())
                        .addToBackStack(null).commit();
                break;
        }
    }
}
