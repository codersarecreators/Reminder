package com.codersarecreators.reminder;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Contacts;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class addReminder extends Activity {
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_reminder);
		setupActionBar();
	}
	
	private void setupActionBar() {

		getActionBar().setDisplayHomeAsUpEnabled(true);

	}
	
	public void saveReminder(View view){
		
		Toast.makeText(getApplicationContext(), "Reminder is set", Toast.LENGTH_LONG+1).show();
	}
	
	public void SMSDialogue(View view){
		final Dialog dialog = new Dialog(this);
		dialog.setCancelable(true);
		dialog.setTitle("Mobile Number");
		dialog.setContentView(R.layout.dialog);
		
		
		dialog.show();
	}
	
	public void selectContacts(View view){
		//Intent intent= new Intent(Intent.ACTION_PICK,  Contacts.CONTENT_URI);

       // startActivityForResult(intent, PICK_CONTACT);
	}
}
