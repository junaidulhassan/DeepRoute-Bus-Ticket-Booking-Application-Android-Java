package com.example.deeproute;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class search_city extends AppCompatActivity {
    public String[] cities = {
            "Karachi", "Lahore", "Faisalabad", "Rawalpindi", "Multan", "Gujranwala",
            "Islamabad", "Peshawar", "Quetta", "Sialkot", "Bahawalpur", "Sargodha",
            "Sukkur", "Larkana", "Sheikhupura", "Jhang", "Rahim Yar Khan", "Gujrat",
            "Mardan", "Kasur", "Hyderabad", "Abbottabad", "Sahiwal", "Okara",
            "Wah Cantt", "Dera Ghazi Khan", "Mirpur Khas", "Gujar Khan", "Sadiqabad",
            "Jacobabad", "Nowshera", "Mingora", "Chiniot", "Kandhkot", "Khuzdar",
            "Ghotki", "Kamoke", "Mandi Bahauddin", "Daska", "Khairpur", "Chakwal",
            "Turbat", "Charsadda", "Jamshoro", "Pakpattan", "Hub", "Dadu", "Nankana Sahib",
            "Shakargarh", "Hafizabad"
    };

    AutoCompleteTextView textView;
    AutoCompleteTextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_city);
        textView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        textView2 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView2);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, cities);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this,android.R.layout.simple_dropdown_item_1line,cities);
        textView.setAdapter(adapter);
        textView2.setAdapter(adapter2);
    }
}