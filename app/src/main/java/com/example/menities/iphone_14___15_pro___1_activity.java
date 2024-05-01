
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		iphone_14___15_pro___1
	 *	@date 		Saturday 20th of April 2024 08:13:13 AM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package com.example.menities;

	import android.app.Activity;
	import android.content.Intent;
	import android.os.Bundle;
	import android.view.View;
	import android.widget.EditText;
	import android.widget.ImageButton;
	import android.widget.ImageView;
	import android.widget.TextView;
	import android.widget.Toast;

	public class iphone_14___15_pro___1_activity extends Activity {

	
	private View _bg__iphone_14___15_pro___1_ek2;
	private EditText rectangle_2;
	private TextView e_mail_or_username;
	private EditText rectangle_3;
	private ImageButton _rectangle_4;
	private TextView log_in;
	private TextView forgot_your_password_;
	private TextView welcome;
	private TextView please_log_in_to_access_your_account_;
	private TextView password;
	private ImageView line_1;
	private ImageView line_2;
	private TextView or_continue_with;
	private View rectangle_5;
	private ImageView rectangle_6;
	private ImageView google_logo;
	private TextView google;
	private TextView outlook;
	private ImageView logo_outlook_34060_1;
	private View _bg__graduation_cap_ek1;
	private ImageView graduation_cap_container;
	private View _bg__graduation_cap_ek3;
	private ImageView graduation_cap_container_ek1;
	private View _bg__graduation_cap_ek5;
	private ImageView graduation_cap_container_ek2;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.iphone_14___15_pro___1);

		
		_bg__iphone_14___15_pro___1_ek2 = (View) findViewById(R.id._bg__iphone_14___15_pro___1_ek2);
		rectangle_2 = (EditText) findViewById(R.id.rectangle_2);
				rectangle_3 = (EditText) findViewById(R.id.rectangle_3);
		_rectangle_4 = (ImageButton) findViewById(R.id._rectangle_4);
		log_in = (TextView) findViewById(R.id.log_in);
		forgot_your_password_ = (TextView) findViewById(R.id.forgot_your_password_);
		welcome = (TextView) findViewById(R.id.welcome);
		please_log_in_to_access_your_account_ = (TextView) findViewById(R.id.please_log_in_to_access_your_account_);
		line_1 = (ImageView) findViewById(R.id.line_1);
		line_2 = (ImageView) findViewById(R.id.line_2);
		or_continue_with = (TextView) findViewById(R.id.or_continue_with);
		rectangle_5 = (View) findViewById(R.id.rectangle_5);
		rectangle_6 = (ImageView) findViewById(R.id.rectangle_6);
		google_logo = (ImageView) findViewById(R.id.google_logo);
		google = (TextView) findViewById(R.id.google);
		outlook = (TextView) findViewById(R.id.outlook);
		logo_outlook_34060_1 = (ImageView) findViewById(R.id.logo_outlook_34060_1);
		_bg__graduation_cap_ek1 = (View) findViewById(R.id._bg__graduation_cap_ek1);
		graduation_cap_container = (ImageView) findViewById(R.id.graduation_cap_container);
		_bg__graduation_cap_ek3 = (View) findViewById(R.id._bg__graduation_cap_ek3);
		graduation_cap_container_ek1 = (ImageView) findViewById(R.id.graduation_cap_container_ek1);
		_bg__graduation_cap_ek5 = (View) findViewById(R.id._bg__graduation_cap_ek5);
		graduation_cap_container_ek2 = (ImageView) findViewById(R.id.graduation_cap_container_ek2);

		_rectangle_4.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				String email = rectangle_2.getText().toString();
				String password = rectangle_3.getText().toString();
				if(email.equals("balaji")&&password.equals("123"))
				{
					Toast.makeText(iphone_14___15_pro___1_activity.this, "login Succesful", Toast.LENGTH_SHORT).show();
					Intent nextScreen = new Intent(iphone_14___15_pro___1_activity.this,MainActivity.class );
					startActivity(nextScreen);
				}
				else
				{
					Toast.makeText(iphone_14___15_pro___1_activity.this, "login UnSuccesful", Toast.LENGTH_SHORT).show();
				}
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	