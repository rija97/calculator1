package com.example.calculator1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnAdd,btnSub
            ,btnMul,btnDiv,btnC,btnEqual;

    EditText ed1;
    char temp;
   int num1,num2, result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1= findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btn0=findViewById(R.id.btn0);
        btnAdd=findViewById(R.id.btnAdd);
        btnSub=findViewById(R.id.btnSub);
        btnMul=findViewById(R.id.btnMul);
        btnDiv=findViewById(R.id.btnDiv);
        btnC=findViewById(R.id.btnC);
        btnEqual=findViewById(R.id.btnEqual);
        ed1 = findViewById(R.id.edText);

         ed1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 ed1.setText(ed1.getText() + "1");
             }
         });

         btn0.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 ed1.setText(ed1.getText() + "0");
             }
         });


         btn1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 ed1.setText(ed1.getText() + "1");
             }
         });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "9");
            }
        });



        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(ed1.getText() + "");
                temp = '+';
                ed1.setText(null);
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(ed1.getText() + "");
                temp = '-';
                ed1.setText(null);
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(ed1.getText() + "");
                temp = '*';
                ed1.setText(null);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(ed1.getText() + "");
                temp = '/';
                ed1.setText(null);
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ed1.setText("");
            }
        });


        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ed1.setText(null);
                num2 = Integer.parseInt(ed1.getText() + "");
               switch (temp) {
                   case '+' :
                       Calculatorclass ca = new Calculatorclass(num1, num2);
                       result = ca.Add();
                       //tvview SetText(ca.add());
                       ed1.setText(result + "");
                       break;

                   case '-' :
                       Calculatorclass cs = new Calculatorclass(num1, num2);
                       result = cs.Sub();
                       //tvview SetText(ca.sub());
                       ed1.setText(result + "");
                       break;

                   case '*' :
                       Calculatorclass cc = new Calculatorclass(num1, num2);
                       result = cc.Mul();
                       //tvview SetText(ca.mul());
                       ed1.setText(result + "");
                       break;

                   case '/' :
                       Calculatorclass cd = new Calculatorclass(num1, num2);
                       result = cd.Div();
                       //tvview SetText(ca.div());
                       ed1.setText(result + "");
                       break;

               }

            }
        });





    }
}


