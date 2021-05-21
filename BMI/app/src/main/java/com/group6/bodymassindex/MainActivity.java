package com.group6.bodymassindex;

	import android.app.*;
	import android.os.*;
	import android.widget.*;
	import android.view.View.*;
	import android.widget.SimpleAdapter.*;
	import android.view.*;

	public class MainActivity extends Activity 
	{private EditText et1,et2;
		private Button btn;
		private TextView textview;
		@Override
		protected void onCreate(Bundle savedInstanceState)
		{
			super.onCreate(savedInstanceState);
			setContentView(R.layout.main);

			et1=(EditText)findViewById(R.id.text1);
			et2=(EditText)findViewById(R.id.text2);
			btn=(Button)findViewById(R.id.calculate);
			textview=(TextView)findViewById(R.id.textview);

			btn.setOnClickListener(new View.OnClickListener(){

					@Override
					public void onClick(View p1)
					{
						double a=Double.parseDouble(et2.getText().toString());
						double b=Double.parseDouble(et1.getText().toString());
						double answer= a/(b*b*0.01*0.01);

						textview.setText(String.valueOf(answer));


					}
				});



		}
	}
