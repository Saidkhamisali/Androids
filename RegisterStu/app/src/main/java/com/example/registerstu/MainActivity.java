package com.example.registerstu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    private EditText editTextStudentName, editTextDepartment, editTextAddress, editTextEmail, editTextPassword;
    private Button buttonRegister;
    long id;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextStudentName = findViewById(R.id.editTextStudentName);
        editTextDepartment = findViewById(R.id.editTextDepartment);
        editTextAddress = findViewById(R.id.editTextAddress);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonRegister = findViewById(R.id.buttonRegister);

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the values entered by the user
                String studentName = editTextStudentName.getText().toString().trim();
                String department = editTextDepartment.getText().toString().trim();
                String address = editTextAddress.getText().toString().trim();
                String email = editTextEmail.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();

                // Validate the input
                if (studentName.isEmpty() || department.isEmpty() || address.isEmpty() || email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                } else {
                    // Perform registration logic here
                    register(id , studentName, department, address, email, password);
                }
            }
        });
    }

    public void register(Long id, String studentName, String department, String address, String email, String password){

        RequestQueue requestQueue = Volley.newRequestQueue(this);

        String url = "http://192.168.43.79:8080/api/vi/student";
        JSONObject jsonObject = new JSONObject();
        try{
            jsonObject.put("id", id);
            jsonObject.put("studentName",studentName);
            jsonObject.put("department",department );
            jsonObject.put("address", address);
            jsonObject.put("email", email);
            jsonObject.put("password", password);
        } catch (JSONException e){
            e.printStackTrace();
        }

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.POST, url, jsonObject,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        // Handle the response from the server
                        Toast.makeText(MainActivity.this, "Data sent to backend", Toast.LENGTH_SHORT).show();
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // Handle the error response from the server
                        Toast.makeText(MainActivity.this, "Error sending data to backend", Toast.LENGTH_SHORT).show();
                    }
                });

        // Add the request to the RequestQueue
        requestQueue.add(request);

    }


}