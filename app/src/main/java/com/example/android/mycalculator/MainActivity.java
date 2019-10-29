package com.example.android.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, enter, add, sub, mul, div, clear, sq, sqrt, cb, cbrt,dec, log10;
    TextView txt1, txt2;
    Double var1, var2, ans;
    Boolean addition = false, subtract= false, multiply = false, devide = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.one);
        b2=(Button)findViewById(R.id.two);
        b3=(Button)findViewById(R.id.three);
        b4=(Button)findViewById(R.id.four);
        b5=(Button)findViewById(R.id.five);
        b6=(Button)findViewById(R.id.six);
        b7=(Button)findViewById(R.id.seven);
        b8=(Button)findViewById(R.id.eight);
        b9=(Button)findViewById(R.id.nine);
        b0=(Button)findViewById(R.id.zero);
        enter=(Button)findViewById(R.id.enter);
        add=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.sub);
        mul=(Button)findViewById(R.id.mul);
        div=(Button)findViewById(R.id.div);
        clear=(Button)findViewById(R.id.clear);
        cb=(Button)findViewById(R.id.cub);
        cbrt=(Button)findViewById(R.id.cubroot);
        dec = findViewById(R.id.dec);
        log10 = findViewById(R.id.log);
        sq = findViewById(R.id.sq);
        sqrt = findViewById(R.id.sqrt);

        txt1=(TextView)findViewById(R.id.txt1);
        txt2=(TextView)findViewById(R.id.txt2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText() + "1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText()+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText()+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText()+"9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText()+"0");
            }
        });

        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText()+".");
            }
        });

        log10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setVar1();  // Hàm chuyển đổi txt1 đang ở dạng Text sang dạng Double và gán cho var1
                colorChange(log10); // Hàm lấy màu cho button
                ans = Math.log10(var1); // ans = Hàm tính logarit cơ số 10 của var1
                txt2.setText(ans.toString()); // Gán txt2 cho chuổi từ biến ans
                enter.setEnabled(false); // Vô hiệu hóa nút Enter
                buttonFalse(); //Vô hiệu hóa nút +, -, X, : và txt1.setText("")
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setVar1();  // Hàm chuyển đổi txt1 đang ở dạng Text sang dạng Double và gán cho var1
                colorChange(add);  // Hàm lấy màu cho button
                buttonFalse();  //Vô hiệu hóa nút
                addition = true;
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setVar1();
                colorChange(sub);
                buttonFalse();
                subtract = true;
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setVar1();
                colorChange(mul);
                buttonFalse();
                multiply= true;
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setVar1();
                colorChange(div);
                buttonFalse();
                devide = true;
            }
        });

        sq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setVar1();
                colorChange(sq);
                ans = var1 * var1;
                txt2.setText(ans.toString());
                allReset();
                txt1.setText(txt2.getText().toString());
            }
        });

        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setVar1();
                colorChange(sqrt);
                ans = Math.sqrt(var1);
                txt2.setText(ans.toString());
                allReset();
                txt1.setText(txt2.getText().toString());

            }
        });

        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setVar1();
                colorChange(cb);
                ans = var1*var1*var1;
                txt2.setText(ans.toString());
                allReset();
                txt1.setText(txt2.getText().toString());
            }
        });

        cbrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setVar1();
                colorChange(cbrt);
                ans = Math.cbrt(var1);
                txt2.setText(ans.toString());
                allReset();
                txt1.setText(txt2.getText().toString());
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                allReset();
                txt2.setText("");
            }
        });

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2 = Double.parseDouble(txt1.getText().toString());
                if (addition) {
                    ans = (var1 + var2);
                } else if (subtract) {
                    ans = (var1 - var2);
                } else if (multiply) {
                    ans = (var1 * var2);
                } else if (devide) {
                    ans = (var1 / var2);
                } else {
                    ans = (ans + 0);
            }
                txt2.setText(ans.toString());
                enter.setEnabled(false);
                allReset();
                txt1.setText(txt2.getText().toString());
            }
        });
    }

    public void buttonFalse() {
        sub.setEnabled(false);
        mul.setEnabled(false);
        div.setEnabled(false);
        add.setEnabled(false);
        txt1.setText("");
    }

    public void setVar1() {
        var1 = Double.parseDouble(txt1.getText().toString());  //Chuyển đổi 1 String (txt1.getText().toString() thành Double Double.parseDouble()
    }

    public void allReset() {
        sq.setBackgroundColor(getResources().getColor(R.color.colorOrange));
        sqrt.setBackgroundColor(getResources().getColor(R.color.colorOrange));
        cb.setBackgroundColor(getResources().getColor(R.color.colorOrange));
        cbrt.setBackgroundColor(getResources().getColor(R.color.colorOrange));
        cbrt.setBackgroundColor(getResources().getColor(R.color.colorOrange));
        log10.setBackgroundColor(getResources().getColor(R.color.colorOrange));
        add.setBackgroundColor(getResources().getColor(R.color.colorOrange));
        mul.setBackgroundColor(getResources().getColor(R.color.colorOrange));
        sub.setBackgroundColor(getResources().getColor(R.color.colorOrange));
        div.setBackgroundColor(getResources().getColor(R.color.colorOrange));

        enter.setEnabled(true);
        add.setEnabled(true);
        sub.setEnabled(true);
        mul.setEnabled(true);
        div.setEnabled(true);

        addition = false;
        subtract = false;
        multiply = false;
        devide = false;

        txt1.setText("");
    }

    public void colorChange(Button b) {
        b.setBackgroundColor(getResources().getColor(R.color.colorYellow));
        //Thiết lập màu nền cho button: setBackgroundColor()
        // khai báo nguồn lấy từ resources getResources()
        // khai báo loại màu getColor(R.color.colorAccent)
    }
}
