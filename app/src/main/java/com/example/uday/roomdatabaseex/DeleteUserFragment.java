package com.example.uday.roomdatabaseex;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class DeleteUserFragment extends Fragment {


    private EditText userIdEt,userEmailEt;
    private Button btnDeleteUSer;
    public DeleteUserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_delete_user, container, false);
        userIdEt = (EditText)view.findViewById(R.id.delete_user_id);
        userEmailEt = (EditText)view.findViewById(R.id.delete_user_email);
        btnDeleteUSer = (Button)view.findViewById(R.id.delete_user);
        btnDeleteUSer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = Integer.parseInt(userIdEt.getText().toString());
                User user =new User();
                user.setId(id);
                //user.getEmail();
                MainActivity.myAppDatabase.myDao().deleteUser(user);
                userIdEt.setText("");
                Toast.makeText(getContext(),"User deleted...",Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }

}
