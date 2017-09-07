package fi.jamk.hawnin.assignment02login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView actv = (AutoCompleteTextView)
                findViewById(R.id.autoCompleteTextView2);
        ArrayAdapter<String> aa= new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,
                new String[]{"Pasi","juha","Kari","Jouni","Esa","Hannu"});
        actv.setAdapter(aa);
    }
    public void selectButtonClicked(View view){
        String text1 = ((AutoCompleteTextView)findViewById(R.id.autoCompleteTextView2)).getText().toString();
        String text2 = ((EditText)findViewById(R.id.editText4)).getText().toString();
        text1+=""+text2;
        Toast.makeText(getApplicationContext(), text1, Toast.LENGTH_SHORT).show();
    }
}
