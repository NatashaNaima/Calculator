package com.example.simple_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;
import java.lang.Math;


public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
    buttonClear, buttonEqual, buttonDivide, buttonMulti, buttonSub, buttonAdd, buttonDecimal, buttonExponent;

    TextView edtTxt;

    ArrayList<Double> values = new ArrayList<Double>();;
    ArrayList<String> operands = new ArrayList<String>();;
    String current="0";
    boolean division = false, multi=false, sub=false, add=false, expo=false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializing buttons
        button0 = (Button) findViewById(R.id.btn0);
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button4 = (Button) findViewById(R.id.btn4);
        button5 = (Button) findViewById(R.id.btn5);
        button6 = (Button) findViewById(R.id.btn6);
        button7 = (Button) findViewById(R.id.btn7);
        button8 = (Button) findViewById(R.id.btn8);
        button9 = (Button) findViewById(R.id.btn9);
        buttonClear = (Button) findViewById(R.id.btnclear);
        buttonEqual = (Button) findViewById(R.id.btnequal);
        buttonDivide = (Button) findViewById(R.id.btndivide);
        buttonMulti = (Button) findViewById(R.id.btnmultiply);
        buttonSub = (Button) findViewById(R.id.btnminus);
        buttonAdd = (Button) findViewById(R.id.btnplus);
        buttonDecimal = (Button) findViewById(R.id.btndec);
        buttonExponent = (Button) findViewById(R.id.btnexponent);

        edtTxt = (TextView) findViewById(R.id.display);

        //onclicks
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edtTxt.setText(edtTxt.getText() + "1");
                current+= "1";
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edtTxt.setText(edtTxt.getText() + "2");
                current+= "2";
            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edtTxt.setText(edtTxt.getText() + "3");
                current+= "3";
            }
        });
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edtTxt.setText(edtTxt.getText() + "4");
                current+= "4";
            }
        });
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edtTxt.setText(edtTxt.getText() + "5");
                current+= "5";
            }
        });
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edtTxt.setText(edtTxt.getText() + "6");
                current+= "6";
            }
        });
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edtTxt.setText(edtTxt.getText() + "7");
                current+= "7";
            }
        });
        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edtTxt.setText(edtTxt.getText() + "8");
                current+= "8";
            }
        });
        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edtTxt.setText(edtTxt.getText() + "9");
                current+= "9";
            }
        });
        button0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edtTxt.setText(edtTxt.getText() + "0");
                current+= "0";
            }
        });
        buttonDecimal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edtTxt.setText(edtTxt.getText() + ".");
                current+= ".";
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                try {
                    if (edtTxt.getText().length() != 0) {
                        String input = (String) edtTxt.getText();
                        values.add(Double.parseDouble(current));
                        current = "";
                        operands.add("+");
                    }
                    add = true;
                    edtTxt.setText(edtTxt.getText() + "+");
                } catch(NumberFormatException e){
                    edtTxt.setText("invalid inputs, clear and try again.");
                }
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                try {
                    if (edtTxt.getText().length() != 0) {
                        String input = (String) edtTxt.getText();
                        values.add(Double.parseDouble(current));
                        current = "";
                        operands.add("-");
                    }
                    sub = true;
                    edtTxt.setText(edtTxt.getText() + "-");
                }catch(NumberFormatException e){
                    edtTxt.setText("invalid inputs, clear and try again.");
                }
            }
        });
        buttonDivide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    if (edtTxt.getText().length() != 0) {
                        String input = (String) edtTxt.getText();
                        values.add(Double.parseDouble(current));
                        current = "";
                        operands.add("/");
                    }
                    division = true;
                    edtTxt.setText(edtTxt.getText() + "/");
                }catch(NumberFormatException e){
                    edtTxt.setText("invalid inputs, clear and try again.");
                }
            }
        });
        buttonMulti.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    if (edtTxt.getText().length() != 0) {
                        String input = (String) edtTxt.getText();
                        values.add(Double.parseDouble(current));
                        current = "";
                        operands.add("*");
                    }
                    multi = true;
                    edtTxt.setText(edtTxt.getText() + "x");
                }catch(NumberFormatException e){
                    edtTxt.setText("invalid inputs, clear and try again.");
                }
            }
        });
        buttonExponent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (edtTxt.getText().length() != 0) {
                        String input = (String) edtTxt.getText();
                        values.add(Double.parseDouble(current));
                        current = "";
                        operands.add("^");
                    }
                    expo = true;
                    edtTxt.setText(edtTxt.getText() + "^");
                }catch(NumberFormatException e){
                    edtTxt.setText("invalid inputs, clear and try again.");
                }
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edtTxt.setText(null);
                values.clear();
                operands.clear();
                current = "";
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                try {
                    values.add(Double.parseDouble(current));
                    int i = 1;
                    //exponent
                    while (i<values.size() && values.size() != 1 && expo) {
                        double input1 = values.get(i-1);
                        double input2 = values.get(i);
                        String operand = operands.get(i-1);
                        double result;
                        if(operand == "^") {
                            result = Math.pow(input1, input2);
                            values.set(i, result);
                            values.remove(i - 1);
                        }else{i+=1;}
                    }
                    i = 1;
                    // division and multiplication
                    while (i < values.size() && values.size() != 1 && (division || multi)) {
                        double input2 = values.get(i);
                        double input1 = values.get(i - 1);
                        String operand = operands.get(i - 1);
                        double result;
                        if (operand == "*") {
                            result = input1 * input2;
                            values.set(i, result);
                            values.remove(i - 1);
                        } else if (operand == "/") {
                            result = input1 / input2;
                            values.set(i, result);
                            values.remove(i - 1);
                        } else{ i+=1;}
                    }
                    i = 1;
                    //addition and subtraction
                    while (values.size() != 1 && (add || sub)) {
                        double input2 = values.get(i);
                        double input1 = values.get(i - 1);
                        String operand = operands.get(i - 1);
                        double result;
                        if (operand == "+") {
                            result = input1 + input2;
                            values.set(i, result);
                            values.remove(i - 1);
                        } else if (operand == "-") {
                            result = input1 - input2;
                            values.set(i, result);
                            values.remove(i - 1);
                        }
                    }
                    String result = values.get(0).toString();
                    values.clear();
                    operands.clear();
                    current = result;
                    edtTxt.setText(result);
                } catch(NumberFormatException e){
                    edtTxt.setText("invalid inputs, clear and try again.");
                }
            }

        });
    }
}