package com.example.dialogdemo;


import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.app.ProgressDialog;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.TextView;

public class ProgDialog extends Activity {
    private ProgressDialog progressBar;
      int i =0;
      TextView tv ;
    private Handler handler = new Handler();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_progdialog);
 tv = new TextView(this);
	}
	
	public void open(View v)
	{ 
	    
       
		// prepare for a progress bar dialog
		progressBar = new ProgressDialog(v.getContext());
		progressBar.setCancelable(true);
		progressBar.setMessage("File downloading ...");
		progressBar.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
		progressBar.setProgress(10);
		progressBar.setMax(100);
		
		progressBar.show();
				//i=0;
		final Thread t = new Thread(){

			   @Override
		  public void run(){
		
		     while(i <= 100){
		    	
		        try {
		            sleep(100);
		            i += 1;
		            progressBar.setProgress(i);
		        } catch (InterruptedException e) {
		           // TODO Auto-generated catch block
		          e.printStackTrace();
		        }
		    } // end of while
		           progressBar.dismiss(); 		   
			   }// end of run
			 		
		};  
		  t.start(); 
		  	 
	}
	
				@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.prog_dialog, menu);
		return true;
	}

}
