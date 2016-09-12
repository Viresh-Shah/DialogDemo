package com.example.dialogdemo;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class Customdialog extends Activity{
	final private static int DIALOG_LOGIN = 1;

	 @Override
	 public void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);
	  setContentView(R.layout.activity_customdialog);

	  Button launch_button = (Button) findViewById(R.id.btn_launch);

	  launch_button.setOnClickListener(new View.OnClickListener() {

	   @Override
	   public void onClick(View v) {
	    showDialog(DIALOG_LOGIN);
	   }
	  });
	 }
	 
	 
	 @Override
	 protected Dialog onCreateDialog(int id) {

	  AlertDialog dialogDetails = null;

	  switch (id) {
	  case DIALOG_LOGIN:
	   LayoutInflater inflater = LayoutInflater.from(this);
	   View dialogview = inflater.inflate(R.layout.dialog_layout, null);

	   AlertDialog.Builder dialogbuilder = new AlertDialog.Builder(this);
	   dialogbuilder.setTitle("Login");
	   dialogbuilder.setView(dialogview);
	   dialogDetails = dialogbuilder.create();

	   break;
	  }
	  
	  return dialogDetails;
	 }
	 
}
