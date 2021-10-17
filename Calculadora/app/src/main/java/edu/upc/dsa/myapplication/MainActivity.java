package edu.upc.dsa.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String A;
    private String B;
    private String operacion;
    private TextView resultado;
    private double numero1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        A = "";
        B = "";
        operacion = "";
        resultado = findViewById(R.id.resultado1);

        numero1 = 0;
    }
    private void funcionOperacion (){
        if (operacion == "suma") {
            numero1 = Double.parseDouble(A) + Double.parseDouble(B);
        }

        else if (operacion == "resta") {
            numero1 = Double.parseDouble(A) - Double.parseDouble(B);
        }

        else if (operacion == "multiplicacion") {
            numero1 = Double.parseDouble(A) * Double.parseDouble(B);
        }
        resultado.setText(String.valueOf(numero1));
        A = String.valueOf(numero1);
        B = "";
        operacion = "";
    }

    public void suma (View v){
        operacion = "suma";
    }
    public void resta (View v){
        operacion = "resta";
    }
    public void multiplicacion (View v){
        operacion = "multiplicacion";
    }
    public void igual (View v){
        funcionOperacion();
        resultado.setText(String.valueOf("TOTAL: " + numero1));
        operacion = "";
        A = "";
        B = "";
    }

    public void borrar (View v){
        resultado.setText(String.valueOf(""));
        operacion = "";
        A = "";
        B = "";
    }

    public void num1 (View v){
        if (operacion ==""){
            A = A + "1";
            resultado.setText(A);
        }
        else{
            B = B + "1";
            resultado.setText(B);
            funcionOperacion();
        }
    }

    public void num2 (View v){
        if (operacion ==""){
            A = A + "2";
            resultado.setText(A);
        }
        else{
            B = B + "2";
            resultado.setText(B);
            funcionOperacion();
        }
    }

    public void num3 (View v){
        if (operacion ==""){
            A = A + "3";
            resultado.setText(A);
        }
        else{
            B = B + "3";
            resultado.setText(B);
            funcionOperacion();
        }
    }
    public void num4 (View v){
        if (operacion ==""){
            A = A + "4";
            resultado.setText(A);
        }
        else{
            B = B + "4";
            resultado.setText(B);
            funcionOperacion();
        }
    }
    public void num5 (View v){
        if (operacion ==""){
            A = A + "5";
            resultado.setText(A);
        }
        else{
            B = B + "5";
            resultado.setText(B);
            funcionOperacion();
        }
    }
    public void num6 (View v){
        if (operacion ==""){
            A = A + "6";
            resultado.setText(A);
        }
        else{
            B = B + "6";
            resultado.setText(B);
            funcionOperacion();
        }
    }
    public void num7 (View v){
        if (operacion ==""){
            A = A + "7";
            resultado.setText(A);
        }
        else{
            B = B + "7";
            resultado.setText(B);
            funcionOperacion();
        }
    }
    public void num8 (View v){
        if (operacion ==""){
            A = A + "8";
            resultado.setText(A);
        }
        else{
            B = B + "8";
            resultado.setText(B);
            funcionOperacion();
        }
    }
    public void num9 (View v){
        if (operacion ==""){
            A = A + "9";
            resultado.setText(A);
        }
        else{
            B = B + "9";
            resultado.setText(B);
            funcionOperacion();
        }
    }
    public void num0 (View v){
        if (operacion ==""){
            A = A + "0";
            resultado.setText(A);
        }
        else{
            B = B + "0";
            resultado.setText(B);
            funcionOperacion();
        }
    }
}