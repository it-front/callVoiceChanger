package com.callvoicechanger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class Logo extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Full Screen
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.logo);

		Thread timer = new Thread() {
			public void run() {
				try {
					sleep(3000); // The time it runs for in milliseconds. Example: 3000ms = 3s
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					Intent mainActivityIntent = new Intent("com.callvoicechanger.MAINACTIVITY");
					startActivity(mainActivityIntent);
				}
			}
		};
		timer.start();
	}

	@Override
	public void onStart() {
		super.onStart();
	}

	protected void onStop() {
		super.onStop();
		super.finish();
	}
}
