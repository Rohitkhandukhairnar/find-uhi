package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//}

import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

        import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // You can initialize other components or perform setup here if needed
    }

    // Function to handle search button click.
    public void onSearchClick(View view) {
        EditText editTextUHI = findViewById(R.id.editTextUHI);
        TextView textViewPersonDetails = findViewById(R.id.textViewPersonDetails);

        String uhi = editTextUHI.getText().toString();

        if (!uhi.isEmpty()) {
            // Here you would typically query your database or perform some logic
            // to retrieve person details based on the UHI ID.

            // For this example, let's assume you have a method to get person details.
            // Replace this with your actual logic.
            String personDetails = getPersonDetailsByUHI(uhi);

            if (personDetails != null) {
                // Display person details.
                textViewPersonDetails.setText(personDetails);
            } else {
                // Handle case when person is not found.
                textViewPersonDetails.setText("Person not found");
            }
        } else {
            // Handle case when UHI is empty.
            // You can display an error message or take appropriate action.
            textViewPersonDetails.setText("Please enter a UHI ID");
        }
    }

    // Example method to get person details by UHI (replace this with your actual logic).
    private String getPersonDetailsByUHI(String uhi) {
        // In a real application, you would typically query your database or API
        // to get person details based on the UHI ID.
        // For this example, return a hardcoded string.
        if (uhi.equals("123456@uhi")) {
            return "Name: John Doe\nAge: 30\nGender: Male";
        } else {
            return null; // Person not found
        }
    }
}
