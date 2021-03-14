package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private enum OPERATOR{
        PLUS,SUBTRACT,MULTIPLY,DIVIDE,EQUAL,DOT
    }
    TextView txtCalculation;
    TextView txtResults;


    //Instance variable
    private String currentNumber;
    private String stringNumberAtleft;
    private String stringNumberAtRight;
    private OPERATOR currentOperator;
    private  int calculationsResult;
    private String calculationsString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currentNumber="";
        calculationsResult=0;

        calculationsString="";

        txtCalculation = (TextView) findViewById(R.id.txtCalculation);
        txtResults = (TextView) findViewById(R.id.txtResults);

        findViewById(R.id.btnEqual).setOnClickListener(MainActivity.this);
        findViewById(R.id.btnSeven).setOnClickListener(MainActivity.this);
        findViewById(R.id.btnEight).setOnClickListener(MainActivity.this);
        findViewById(R.id.btnSix).setOnClickListener(MainActivity.this);
        findViewById(R.id.btnFive).setOnClickListener(MainActivity.this);
        findViewById(R.id.btnFour).setOnClickListener(MainActivity.this);
        findViewById(R.id.btnThree).setOnClickListener(MainActivity.this);
        findViewById(R.id.btnTwo).setOnClickListener(MainActivity.this);
        findViewById(R.id.btnOne).setOnClickListener(MainActivity.this);
        findViewById(R.id.btnNine).setOnClickListener(MainActivity.this);
        findViewById(R.id.btnZero).setOnClickListener(MainActivity.this);

        findViewById(R.id.btnPlus).setOnClickListener(MainActivity.this);
        findViewById(R.id.btnSubstract).setOnClickListener(MainActivity.this);
        findViewById(R.id.btnMultiply).setOnClickListener(MainActivity.this);
        findViewById(R.id.btnDivide).setOnClickListener(MainActivity.this);
        findViewById(R.id.btnClear).setOnClickListener(MainActivity.this);


    }


    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.btnEqual:

                operatorIsTapped(OPERATOR.EQUAL);
                break;
            case R.id.btnPlus:
                operatorIsTapped(OPERATOR.PLUS);
                calculationsString += " + ";
                break;
            case R.id.btnSubstract:
                operatorIsTapped(OPERATOR.SUBTRACT);
                calculationsString += " - ";

                break;
            case R.id.btnMultiply:
                operatorIsTapped(OPERATOR.MULTIPLY);
                calculationsString += " * ";

                break;
            case R.id.btnDivide:
                operatorIsTapped(OPERATOR.DIVIDE);
                calculationsString += " / ";

                break;
            case R.id.btnDot:
                operatorIsTapped(OPERATOR.DOT);
                calculationsString += " . ";

                break;
            case R.id.btnClear:
                cleartapped();
                break;
            case R.id.btnOne:
                numberIsTapped(1);
                break;
            case R.id.btnTwo:
                numberIsTapped(2);
                break;
            case R.id.btnThree:
                numberIsTapped(3);
                break;
            case R.id.btnFour:
                numberIsTapped(4);
                break;
            case R.id.btnFive:
                numberIsTapped(5);
                break;
            case R.id.btnSix:
                numberIsTapped(6);
                break;
            case R.id.btnSeven:
                numberIsTapped(7);
                break;
            case R.id.btnEight:
                numberIsTapped(8);
                break;
            case R.id.btnNine:
                numberIsTapped(9);
                break;
            case R.id.btnZero:
                numberIsTapped(0);
                break;


        }

        txtCalculation.setText(calculationsString);

    }

    private void numberIsTapped(int tappedNumber){

        currentNumber=currentNumber+String.valueOf(tappedNumber);
        txtResults.setText(currentNumber);
        calculationsString= currentNumber;
        txtCalculation.setText(calculationsString);
    }

    private  void operatorIsTapped(OPERATOR tappedOperator){
        if(currentOperator!=null ) {
            if (currentNumber != null) {

                stringNumberAtRight = currentNumber;
                currentNumber = "";

                switch (currentOperator) {

                    case PLUS:
                        calculationsResult = Integer.parseInt(stringNumberAtleft) +
                                Integer.parseInt(stringNumberAtRight);
                        break;

                    case SUBTRACT:
                        calculationsResult = Integer.parseInt(stringNumberAtleft) -
                                Integer.parseInt(stringNumberAtRight);
                        break;

                    case MULTIPLY:
                        calculationsResult = Integer.parseInt(stringNumberAtleft) *
                                Integer.parseInt(stringNumberAtRight);
                        break;

                    case DIVIDE:
                        calculationsResult = Integer.parseInt(stringNumberAtleft) /
                                Integer.parseInt(stringNumberAtRight);
                        break;
                }

                stringNumberAtleft = String.valueOf(calculationsResult);
                txtResults.setText(stringNumberAtleft);
                calculationsString = stringNumberAtleft;
            }
        }
        else{

            stringNumberAtleft=currentNumber;
            currentNumber="";

        }

        currentOperator=tappedOperator;
    }

    private  void cleartapped() {
        stringNumberAtleft = "";
        stringNumberAtRight = "";
        calculationsString = "";
        calculationsResult = 0;
        currentOperator = null;
        txtResults.setText("0");
        txtCalculation.setText("0");


    }
    }