package com.example.registers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText editTextStudentName, editTextDepartment, editTextAddress, editTextEmail, editTextPassword;
    private Button buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI components
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
                String StudentName = editTextStudentName.getText().toString().trim();
                String department = editTextDepartment.getText().toString().trim();
                String address = editTextAddress.getText().toString().trim();
                String email = editTextEmail.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();

                // Validate the input
                if (StudentName.isEmpty() || department.isEmpty() || address.isEmpty() || email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                } else {
                    // Perform registration logic here
                    register(StudentName, department, address, email, password);
                }
            }
        });
    }

    private void register(String studentName, String department, String address, String email, String password) {

        Toast.makeText(MainActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
    }
}
