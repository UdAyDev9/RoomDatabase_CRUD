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
public class UpdateUserFragment extends Fragment {

    private EditText idEt,nameEt,emailEt;
    private Button btnUpdate;

    public UpdateUserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_update_user, container, false);

        idEt = (EditText)view.findViewById(R.id.update_user_id);
        nameEt = (EditText)view.findViewById(R.id.update_user_name);
        emailEt = (EditText)view.findViewById(R.id.update_user_email);
        btnUpdate = (Button) view.findViewById(R.id.update_user);
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int idStr = Integer.parseInt(idEt.getText().toString());
                String nameStr = nameEt.getText().toString();
                String emailStr = emailEt.getText().toString();

                User user = new User();
                user.setId(idStr);
                user.setName(nameStr);
                user.setEmail(emailStr);
                MainActivity.myAppDatabase.myDao().updateUser(user);
                Toast.makeText(getActivity(),"User updated....",Toast.LENGTH_LONG).show();
                idEt.setText("");
                nameEt.setText("");
                emailEt.setText("");
            }
        });
        return view;
    }

}
