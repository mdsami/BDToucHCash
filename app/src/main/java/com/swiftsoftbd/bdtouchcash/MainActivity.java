package com.swiftsoftbd.bdtouchcash;


import android.content.Context;
import android.os.Bundle;
import android.net.Uri;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends Activity   {

	Button bkash ;
	Button dbbl ;
	Button mcash ;
	Button ucash ;
	Button mycash ;
	Button surecash ;
	Button ific;
	Button ok;
	final Context context = this;

	private InterstitialAd InterstitialAd;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		bkash= (Button)findViewById(R.id.bkash);
		dbbl = (Button)findViewById(R.id.dbbl);
		mcash =(Button) findViewById(R.id.mcash);
		ucash =(Button) findViewById(R.id.ucash);
		mycash =(Button) findViewById(R.id.mycash);
		surecash =(Button)findViewById(R.id.surecash);
		ific =(Button)findViewById(R.id.ifci);
		ok = (Button)findViewById(R.id.ok);


		AdView mAdView = (AdView) findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder().build();
		mAdView.loadAd(adRequest);


		// Create the InterstitialAd and set the adUnitId.
		InterstitialAd = new InterstitialAd(this);
		// Defined in res/values/strings.xml
		InterstitialAd.setAdUnitId(getString(R.string.interstitial_ad_unit_id));
		//prepare ads
		AdRequest madRequest = new AdRequest.Builder().build();
		InterstitialAd.loadAd(madRequest);

		bkash.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				try {
					Intent callIntent = new Intent(Intent.ACTION_CALL);
					// callIntent.setData(Uri.parse("tel:*247" + Uri.encode("#")));
					//startActivity(callIntent);

					String encodedHash = Uri.encode("#");
					String ussd = "*" + "247" + encodedHash;
					startActivityForResult(new Intent("android.intent.action.CALL",
							Uri.parse("tel:" + ussd)), 1);

				} catch (ActivityNotFoundException activityException) {
					Log.e(" dialing example", "Call failed",activityException);
				}
			}
		});

		dbbl.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				try {
					Intent callIntent = new Intent(Intent.ACTION_CALL);
					// callIntent.setData(Uri.parse("tel:*247" + Uri.encode("#")));
					//startActivity(callIntent);

					String encodedHash = Uri.encode("#");
					String ussd = "*" + "322" + encodedHash;
					startActivityForResult(new Intent("android.intent.action.CALL",
							Uri.parse("tel:" + ussd)), 1);

				} catch (ActivityNotFoundException activityException) {
					Log.e(" dialing example", "Call failed",activityException);
				}
			}
		});

		mcash.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				try {
					Intent callIntent = new Intent(Intent.ACTION_CALL);
					// callIntent.setData(Uri.parse("tel:*247" + Uri.encode("#")));
					//startActivity(callIntent);

					String encodedHash = Uri.encode("#");
					String ussd = "*" + "455" + encodedHash;
					startActivityForResult(new Intent("android.intent.action.CALL",
							Uri.parse("tel:" + ussd)), 1);

				} catch (ActivityNotFoundException activityException) {
					Log.e("dialing example", "Call failed",activityException);
				}

			}
		});

		ucash.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				try {
					Intent callIntent = new Intent(Intent.ACTION_CALL);
					// callIntent.setData(Uri.parse("tel:*247" + Uri.encode("#")));
					//startActivity(callIntent);

					String encodedHash = Uri.encode("#");
					String ussd = "*" + "268" + encodedHash;
					startActivityForResult(new Intent("android.intent.action.CALL",
							Uri.parse("tel:" + ussd)), 1);

				} catch (ActivityNotFoundException activityException) {
					Log.e("dialing example", "Call failed",activityException);
				}
			}
		});

		mycash.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				try {
					Intent callIntent = new Intent(Intent.ACTION_CALL);
					// callIntent.setData(Uri.parse("tel:*247" + Uri.encode("#")));
					//startActivity(callIntent);

					String encodedHash = Uri.encode("#");
					String ussd = "*" + "225" + encodedHash;
					startActivityForResult(new Intent("android.intent.action.CALL",
							Uri.parse("tel:" + ussd)), 1);

				} catch (ActivityNotFoundException activityException) {
					Log.e(" dialing example", "Call failed",activityException);
				}
			}
		});

		surecash.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				try {
					Intent callIntent = new Intent(Intent.ACTION_CALL);
					// callIntent.setData(Uri.parse("tel:*247" + Uri.encode("#")));
					//startActivity(callIntent);

					String encodedHash = Uri.encode("#");
					String ussd = "*" + "257" + encodedHash;
					startActivityForResult(new Intent("android.intent.action.CALL",
							Uri.parse("tel:" + ussd)), 1);

				} catch (ActivityNotFoundException activityException) {
					Log.e(" dialing example", "Call failed", activityException);
				}
			}
		});

		ok.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				try {
					Intent callIntent = new Intent(Intent.ACTION_CALL);
					// callIntent.setData(Uri.parse("tel:*247" + Uri.encode("#")));
					//startActivity(callIntent);

					String encodedHash = Uri.encode("#");
					String ussd = "*" + "269" + encodedHash;
					startActivityForResult(new Intent("android.intent.action.CALL",
							Uri.parse("tel:" + ussd)), 1);

				} catch (ActivityNotFoundException activityException) {
					Log.e(" dialing example", "Call failed", activityException);
				}

			}
		});

		ific.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				try {
					Intent callIntent = new Intent(Intent.ACTION_CALL);
					// callIntent.setData(Uri.parse("tel:*247" + Uri.encode("#")));
					//startActivity(callIntent);

					String encodedHash = Uri.encode("#");
					String ussd = "*" + "255" + encodedHash;
					startActivityForResult(new Intent("android.intent.action.CALL",
							Uri.parse("tel:" + ussd)), 1);

				} catch (ActivityNotFoundException activityException) {
					Log.e(" dialing example", "Call failed", activityException);
				}
			}
		});



	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}


	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		int i = 1;
		Object localObject;
		boolean bool = false;

		switch (item.getItemId()){

			case R.id.share:{
				Intent shareIntent = new Intent(Intent.ACTION_SEND);
				shareIntent.setAction(Intent.ACTION_SEND);
				shareIntent.setType("text/plain");
				shareIntent.putExtra(Intent.EXTRA_TEXT, "Enjoy This Apps https://play.google.com/store/apps/details?id=com.swiftsoftbd.bdtouchcash");

				startActivity(shareIntent);

              break;
			}
			case R.id.about:{
				Intent intent = new Intent(this,About.class);
				startActivity(intent);

				break;

			}
			case R.id.exit:{


				localObject = new AlertDialog.Builder(this.context);
				((AlertDialog.Builder)localObject).setTitle("Are you sure to Exit?");
				((AlertDialog.Builder)localObject).setMessage("If you find this app useful! please rate us and like us at facebook").setCancelable(false)
				.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {
						MainActivity.this.finish();
						Intent localIntent = new Intent("android.intent.action.MAIN");
						localIntent.addCategory("android.intent.category.HOME");
						localIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
						MainActivity.this.startActivity(localIntent);
					}
				}).setNeutralButton("Like us", new DialogInterface.OnClickListener()
				{
					public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
					{
						Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.facebook.com/swifttechsoft"));
						MainActivity.this.startActivity(localIntent);
					}
				}).setNegativeButton("Rate us", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {
						Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.swiftsoftbd.bdtouchcash"));
						MainActivity.this.startActivity(localIntent);
					}
				});
				// create alert dialog
				((AlertDialog.Builder)localObject).create().show();

				break;
			}
			default:{
				bool = super.onOptionsItemSelected(item);
			}
		}


		return bool;
	}


	/**
	 * show ads
	 */
	public void showInterstitial() {
		// Show the ad if it's ready
		if (InterstitialAd != null && InterstitialAd.isLoaded()) {
			InterstitialAd.show();
		}
	}

	private void startActivities(Intent intent) {
	}
}
