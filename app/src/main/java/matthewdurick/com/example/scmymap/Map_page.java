package matthewdurick.com.example.scmymap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Map_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_page);
    }

    public void toastMsg(String msg) {
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG); //Creates a pop up message
        toast.show(); //displays message
    }

    public void onClick(View view) {
        EditText num1TxtBox = findViewById(R.id.editTextNum1);
        EditText opTxtBox = findViewById(R.id.editTextOp);
        EditText num2TxtBox = findViewById(R.id.editTextNum2);
        TextView answer = findViewById(R.id.answer);

        String num1String = num1TxtBox.getText().toString();
        int intNum1 = Integer.parseInt(num1String);

        String opString = opTxtBox.getText().toString();

        String num2String = num2TxtBox.getText().toString();
        int intNum2 = Integer.parseInt(num2String);

        float answerNumber = 0;
        float piNumber = (float) 3.14;

        if(opString.equals("+")){
            answerNumber = intNum1 + intNum2;
        }
        else if(opString.equals("-")){
            answerNumber = intNum1 - intNum2;
        }
        else if(opString.equals("*")){
            answerNumber = intNum1 * intNum2;
        }
        else if(opString.equals("/")){
            answerNumber = intNum1 / intNum2;
        }
        else if(opString.equals("pi")){
            answerNumber = (float) (Math.pow(intNum1,2) * piNumber);
            intNum2 = 0;
        }
        else{
            toastMsg("Not a Valid Operator");
        }
        answer.setText(Float.toString(answerNumber));
    }
}