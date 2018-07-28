package com.example.priyamshah.contentprovider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText myInput;
TextView myText;
MyDBHandler dbHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myInput=(EditText)findViewById(R.id.editText);
        myText=(TextView)findViewById(R.id.textView);
        dbHandler=new MyDBHandler(this,null,null,1);
        printDatabase();
    }
   public void printDatabase()
    {
        String dbString=dbHandler.databaseToString();
        myText.setText(dbString);
        myInput.setText("");
    }
    public void addMessages(View v)
    {
        Products p=new Products(myInput.getText().toString());
        dbHandler.addProducts(p);
        printDatabase();
    }
    public void deleteMessages(View v)
    {
        String i=myInput.getText().toString();
        dbHandler.delete(i);
        printDatabase();
    }

}
