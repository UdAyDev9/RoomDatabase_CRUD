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
public class AddUserFragment extends Fragment {

    
    private EditText userId,userName,userEmail;
    private Button btnSaveUser;

    public AddUserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_add_user, container, false);

        userId = (EditText)v.findViewById(R.id.user_id);
        userName = (EditText)v.findViewById(R.id.user_name);
        userEmail = (EditText)v.findViewById(R.id.user_email);
        btnSaveUser = (Button) v.findViewById(R.id.save_user);

        btnSaveUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int userIdStr= Integer.parseInt(userId.getText().toString());
                String userNameStr = userName.getText().toString();
                String userEmailStr = userEmail.getText().toString();

                User user = new User();
                user.setId(userIdStr);
                user.setName(userNameStr);
                user.setEmail(userEmailStr);

                MainActivity.myAppDatabase.myDao().addUser(user);

                Toast.makeText(getActivity(),"User Added Successfully",Toast.LENGTH_LONG).show();
                userId.setText("");
                userName.setText("");
                userEmail.setText("");

            }
        });
        return v;
    }

}
