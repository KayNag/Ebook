package ky.god.pdf;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import ky.god.pdf.R;

import android.app.Activity;
import android.app.Dialog;
import android.app.DownloadManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
 
public class Splash extends Activity {
 
    // button to show progress dialog
    Button btnShowProgress;
    
    // Progress Dialog
    private ProgressDialog pDialog;
//    ImageView my_image;
    // Progress dialog type (0 - for Horizontal progress bar)
    public static final int progress_bar_type = 0; 
 
  
    String Location = "/Android/obb/ky.god.pdf";
    protected boolean _active = true;
    protected int _splashTime = 3000; 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Thread splashTread = new Thread() {
            @Override
            public void run() {
                try {
                    int waited = 0;
                    while (_active && (waited < _splashTime)) {
                        sleep(100);
                        if (_active) {
                            waited += 100;
                        }
                    }
                } catch (Exception e) {

                } finally {

  
       // Button fileDwnloadBtn=(Button)findViewById(R.id.fileDownloadBtn);
     
   
		
				
			File wallpaperDirectory = new File(Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf");
		        if(wallpaperDirectory.exists())
		        {
		        	
		        }else{
		        	wallpaperDirectory.mkdirs();
		        }
		        
		        File myFile = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/Yemen Ebook");  
		        if (myFile.exists())  
		        {  
		      	 myFile.delete();
		      	 myFile = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/Yemen2014 Ebook");
		      	 if (!myFile.exists())  
			        {
		      	        	
		       
		        String DownloadUrl = "http://gulfoilfielddirectory.com/ebook/pdf/yemen2014.pdf";
			    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(DownloadUrl));
			    request.setDescription("Ebook Yemen2014");   //appears the same in Notification bar while downloading
			    request.setTitle("Yemen2014 Ebook");                 
			    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			        request.allowScanningByMediaScanner();
			        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
			    }
			    request.setDestinationInExternalPublicDir(Location, "Yemen2014 Ebook");
			 
			    // get download service and enqueue file
			    DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
			    manager.enqueue(request);
		        }
		      	 
		        } else{
		        	myFile = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/yemen2014 Ebook");
		        	 if (!myFile.exists())  
				        {
			      		
				       // new DownloadFileFromURL().execute(file_yemen);
				        String DownloadUrl = "http://gulfoilfielddirectory.com/ebook/pdf/yemen2014.pdf";
					    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(DownloadUrl));
					    request.setDescription("Ebook Yemen2014");   //appears the same in Notification bar while downloading
					    request.setTitle("Yemen2014 Ebook");                 
					    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
					        request.allowScanningByMediaScanner();
					        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
					    }
					    request.setDestinationInExternalPublicDir(Location, "Yemen2014 Ebook");
					 
					    // get download service and enqueue file
					    DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
					    manager.enqueue(request);
				        }
		        }
		        File myFileuae = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/Uae Ebook");  
		        if (myFileuae.exists())  
		        {  myFileuae.delete();
		        myFileuae = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/UAE2014 Ebook");
		      	 if (!myFileuae.exists())  
			        {
		      			        
		        	String DownloadUrl = "http://gulfoilfielddirectory.com/ebook/pdf/mainbook2014.pdf";
				    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(DownloadUrl));
				    request.setDescription("Ebook UAE2014");   //appears the same in Notification bar while downloading
				    request.setTitle("UAE2014 Ebook");                 
				    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
				        request.allowScanningByMediaScanner();
				        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				    }
				    request.setDestinationInExternalPublicDir(Location, "UAE2014 Ebook");
				 
				    // get download service and enqueue file
				    DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				    manager.enqueue(request);
		        }
		        } else{
		        	 myFileuae = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/UAE2014 Ebook");
		        	 if (!myFileuae.exists())  
				        {
			      	
		        
		        	String DownloadUrl = "http://gulfoilfielddirectory.com/ebook/pdf/mainbook2014.pdf";
				    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(DownloadUrl));
				    request.setDescription("Ebook UAE");   //appears the same in Notification bar while downloading
				    request.setTitle("UAE2014 Ebook");                 
				    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
				        request.allowScanningByMediaScanner();
				        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				    }
				    request.setDestinationInExternalPublicDir(Location, "UAE2014 Ebook");
				 
				    // get download service and enqueue file
				    DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				    manager.enqueue(request);
		        }
		        }
		        File myFilebahrain = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/Bahrain Ebook");  
		        if (myFilebahrain.exists())  
		        {  
		        	myFilebahrain.delete();
		        	myFilebahrain = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/Bahrain2014 Ebook");
			      	 if (!myFilebahrain.exists())  
				        {
			      	
		        	String DownloadUrl = "http://gulfoilfielddirectory.com/ebook/pdf/bahrain2014.pdf";
				    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(DownloadUrl));
				    request.setDescription("Ebook Bahrain2014");   //appears the same in Notification bar while downloading
				    request.setTitle("Bahrain2014 Ebook");                 
				    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
				        request.allowScanningByMediaScanner();
				        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				    }
				    request.setDestinationInExternalPublicDir(Location, "Bahrain2014 Ebook");
				 
				    // get download service and enqueue file
				    DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				    manager.enqueue(request);
		        }
		        }  else{
		        	myFilebahrain = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/Bahrain2014 Ebook");
		        	 if (!myFilebahrain.exists())  
				        {
			      		
		        	String DownloadUrl = "http://gulfoilfielddirectory.com/ebook/pdf/bahrain2014.pdf";
				    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(DownloadUrl));
				    request.setDescription("Ebook Bahrain2014");   //appears the same in Notification bar while downloading
				    request.setTitle("Bahrain2014 Ebook");                 
				    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
				        request.allowScanningByMediaScanner();
				        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				    }
				    request.setDestinationInExternalPublicDir(Location, "Bahrain2014 Ebook");
				 
				    // get download service and enqueue file
				    DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				    manager.enqueue(request);
		        }}
		        File myFilehouston = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/Houston Ebook");  
		        if (myFilehouston.exists())  
		        { 
		        	myFilehouston.delete();
		        	myFilehouston = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/Houston2014 Ebook");
			      	 if (!myFilehouston.exists())  
				        {
			      				        
		        	String DownloadUrl = "http://gulfoilfielddirectory.com/ebook/pdf/houston2014.pdf";
				    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(DownloadUrl));
				    request.setDescription("Ebook Houston2014");   //appears the same in Notification bar while downloading
				    request.setTitle("Houston2014 Ebook");                 
				    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
				        request.allowScanningByMediaScanner();
				        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				    }
				    request.setDestinationInExternalPublicDir(Location, "Houston2014 Ebook");
				 
				    // get download service and enqueue file
				    DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				    manager.enqueue(request);
		        }
		        } else{
		        	myFilehouston = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/Houston2014 Ebook");
		        	 if (!myFilehouston.exists())  
				        {
			      		
		        	String DownloadUrl = "http://gulfoilfielddirectory.com/ebook/pdf/houston2014.pdf";
				    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(DownloadUrl));
				    request.setDescription("Ebook Houston2014");   //appears the same in Notification bar while downloading
				    request.setTitle("Houston2014 Ebook");                 
				    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
				        request.allowScanningByMediaScanner();
				        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				    }
				    request.setDestinationInExternalPublicDir(Location, "Houston2014 Ebook");
				 
				    // get download service and enqueue file
				    DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				    manager.enqueue(request);
		        }}
		        File myFileiran = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/Iran Ebook");  
		        if (myFileiran.exists())  
		        { 
		        	myFileiran.delete();
		        	myFileiran = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/Iran2014 Ebook");  
			      	 if (!myFileiran.exists())  
				        {
			      				        
		        	String DownloadUrl = "http://gulfoilfielddirectory.com/ebook/pdf/iran2014.pdf";
				    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(DownloadUrl));
				    request.setDescription("Ebook Iran2014");   //appears the same in Notification bar while downloading
				    request.setTitle("Iran2014 Ebook");                 
				    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
				        request.allowScanningByMediaScanner();
				        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				    }
				    request.setDestinationInExternalPublicDir(Location, "Iran2014 Ebook");
				 
				    // get download service and enqueue file
				    DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				    manager.enqueue(request);
		        }
		        }  else{
		        	myFileiran = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/Iran2014 Ebook");
		        	 if (!myFileiran.exists())  
				        {
			      			        
		        	String DownloadUrl = "http://gulfoilfielddirectory.com/ebook/pdf/iran2014.pdf";
				    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(DownloadUrl));
				    request.setDescription("Ebook Iran2014");   //appears the same in Notification bar while downloading
				    request.setTitle("Iran2014 Ebook");                 
				    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
				        request.allowScanningByMediaScanner();
				        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				    }
				    request.setDestinationInExternalPublicDir(Location, "Iran2014 Ebook");
				 
				    // get download service and enqueue file
				    DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				    manager.enqueue(request);
		        }}
		        File myFileiraq = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/Iraq Ebook");  
		        if (myFileiraq.exists())  
		        {
		        	myFileiraq.delete();
		        	myFileiraq = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/Iraq2014 Ebook");
			      	 if (!myFileiraq.exists())  
				        {
		        
		        	String DownloadUrl = "http://gulfoilfielddirectory.com/ebook/pdf/iraq2014.pdf";
				    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(DownloadUrl));
				    request.setDescription("Ebook Iraq2014");   //appears the same in Notification bar while downloading
				    request.setTitle("Iraq2014 Ebook");                 
				    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
				        request.allowScanningByMediaScanner();
				        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				    }
				    request.setDestinationInExternalPublicDir(Location, "Iraq2014 Ebook");
				 
				    // get download service and enqueue file
				    DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				    manager.enqueue(request);
		        }
		        }
		        else{
		        	myFileiraq = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/Iraq2014 Ebook");
		        	 if (!myFileiraq.exists())  
				        {
		        	String DownloadUrl = "http://gulfoilfielddirectory.com/ebook/pdf/iraq2014.pdf";
				    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(DownloadUrl));
				    request.setDescription("Ebook Iraq2014");   //appears the same in Notification bar while downloading
				    request.setTitle("Iraq2014 Ebook");                 
				    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
				        request.allowScanningByMediaScanner();
				        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				    }
				    request.setDestinationInExternalPublicDir(Location, "Iraq2014 Ebook");
				 
				    // get download service and enqueue file
				    DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				    manager.enqueue(request);
		        }}
		        File myFilekuwait = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/Kuwait Ebook");  
		        if (myFilekuwait.exists())  
		        {   myFilekuwait.delete();
		        myFilekuwait = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/Kuwait2014 Ebook");
		      	 if (!myFilekuwait.exists())  
			        {
		        	String DownloadUrl = "http://gulfoilfielddirectory.com/ebook/pdf/kuwait2014.pdf";
				    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(DownloadUrl));
				    request.setDescription("Ebook Kuwait2014");   //appears the same in Notification bar while downloading
				    request.setTitle("Kuwait2014 Ebook");                 
				    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
				        request.allowScanningByMediaScanner();
				        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				    }
				    request.setDestinationInExternalPublicDir(Location, "Kuwait2014 Ebook");
				 
				    // get download service and enqueue file
				    DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				    manager.enqueue(request);
		        }   }else{
		        	 myFilekuwait = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/Kuwait2014 Ebook");
		        	 if (!myFilekuwait.exists())  
				        {
		        	String DownloadUrl = "http://gulfoilfielddirectory.com/ebook/pdf/kuwait2014.pdf";
				    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(DownloadUrl));
				    request.setDescription("Ebook Kuwait2014");   //appears the same in Notification bar while downloading
				    request.setTitle("Kuwait2014 Ebook");                 
				    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
				        request.allowScanningByMediaScanner();
				        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				    }
				    request.setDestinationInExternalPublicDir(Location, "Kuwait2014 Ebook");
				 
				    // get download service and enqueue file
				    DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				    manager.enqueue(request);
		        }
		        }
		        File myFileoman = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/Oman Ebook");  
		        if (myFileoman.exists())  
		        {  
		        	myFileoman.delete();
		        	myFileoman = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/Oman2014 Ebook");
				      	 if (!myFileoman.exists())  
					        {
		        
		        	String DownloadUrl = "http://gulfoilfielddirectory.com/ebook/pdf/oman2014.pdf";
				    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(DownloadUrl));
				    request.setDescription("Ebook Oman2014");   //appears the same in Notification bar while downloading
				    request.setTitle("Oman2014 Ebook");                 
				    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
				        request.allowScanningByMediaScanner();
				        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				    }
				    request.setDestinationInExternalPublicDir(Location, "Oman2014 Ebook");
				 
				    // get download service and enqueue file
				    DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				    manager.enqueue(request);
		        }  }    else{
		        	myFileoman = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/Oman2014 Ebook");
		        	 if (!myFileoman.exists())  
				        {
		        
		        	String DownloadUrl = "http://gulfoilfielddirectory.com/ebook/pdf/oman2014.pdf";
				    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(DownloadUrl));
				    request.setDescription("Ebook Oman2014");   //appears the same in Notification bar while downloading
				    request.setTitle("Oman2014 Ebook");                 
				    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
				        request.allowScanningByMediaScanner();
				        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				    }
				    request.setDestinationInExternalPublicDir(Location, "Oman2014 Ebook");
				 
				    // get download service and enqueue file
				    DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				    manager.enqueue(request);
		        }}
		        File myFileqatar = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/Qatar Ebook");  
		        if (myFileqatar.exists())  
		        {   myFileqatar.delete();
		        myFileqatar = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/Qatar2014 Ebook");
		      	 if (!myFileqatar.exists())  
			        {
		        	String DownloadUrl = "http://gulfoilfielddirectory.com/ebook/pdf/qatar2014.pdf";
				    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(DownloadUrl));
				    request.setDescription("Ebook Qatar2014");   //appears the same in Notification bar while downloading
				    request.setTitle("Qatar2014 Ebook");                 
				    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
				        request.allowScanningByMediaScanner();
				        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				    }
				    request.setDestinationInExternalPublicDir(Location, "Qatar2014 Ebook");
				 
				    // get download service and enqueue file
				    DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				    manager.enqueue(request);
		        } } else{
		        	myFileqatar = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/Qatar2014 Ebook");
		        	if (!myFileqatar.exists())  
			        {
		      		 		        
		        	String DownloadUrl = "http://gulfoilfielddirectory.com/ebook/pdf/qatar2014.pdf";
				    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(DownloadUrl));
				    request.setDescription("Ebook Qatar2014");   //appears the same in Notification bar while downloading
				    request.setTitle("Qatar2014 Ebook");                 
				    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
				        request.allowScanningByMediaScanner();
				        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				    }
				    request.setDestinationInExternalPublicDir(Location, "Qatar2014 Ebook");
				 
				    // get download service and enqueue file
				    DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				    manager.enqueue(request);
		        }}
		        File myFilesaudi = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/Saudi Ebook");  
		        if (myFilesaudi.exists())  
		        { myFilesaudi.delete();
		        myFilesaudi = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/Saudi2014 Ebook");
		      	 if (!myFilesaudi.exists())  
			        {
		        
		        	String DownloadUrl = "http://gulfoilfielddirectory.com/ebook/pdf/saudi2014.pdf";
				    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(DownloadUrl));
				    request.setDescription("Ebook Saudi2014");   //appears the same in Notification bar while downloading
				    request.setTitle("Saudi2014 Ebook");                 
				    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
				        request.allowScanningByMediaScanner();
				        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				    }
				    request.setDestinationInExternalPublicDir(Location, "Saudi2014 Ebook");
				 
				    // get download service and enqueue file
				    DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				    manager.enqueue(request);
		        } }else{
		        	 myFilesaudi = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/Saudi2014 Ebook");
		        	 if (!myFilesaudi.exists())  
				        {
		        	String DownloadUrl = "http://gulfoilfielddirectory.com/ebook/pdf/saudi2014.pdf";
				    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(DownloadUrl));
				    request.setDescription("Ebook Saudi2014");   //appears the same in Notification bar while downloading
				    request.setTitle("Saudi2014 Ebook");                 
				    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
				        request.allowScanningByMediaScanner();
				        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				    }
				    request.setDestinationInExternalPublicDir(Location, "Saudi2014 Ebook");
				 
				    // get download service and enqueue file
				    DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				    manager.enqueue(request);
		        }}
		        File myFileinternational = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/International Ebook");  
		        if (myFileinternational.exists())  
		        {  myFileinternational.delete();
		        myFileinternational = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/International2014 Ebook");
		      	 if (!myFileinternational.exists())  
			        {		        
		        	String DownloadUrl = "http://gulfoilfielddirectory.com/ebook/pdf/international2014.pdf";
				    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(DownloadUrl));
				    request.setDescription("Ebook International2014");   //appears the same in Notification bar while downloading
				    request.setTitle("Internation2014 Ebook");                 
				    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
				        request.allowScanningByMediaScanner();
				        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				    }
				    request.setDestinationInExternalPublicDir(Location, "International2014 Ebook");
				 
				    // get download service and enqueue file
				    DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				    manager.enqueue(request);
		        } 
		        }
		        else{ 
		        	 myFileinternational = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/International2014 Ebook");
		        	if (!myFileinternational.exists())  
		        {
			        
		        	String DownloadUrl = "http://gulfoilfielddirectory.com/ebook/pdf/international2014.pdf";
				    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(DownloadUrl));
				    request.setDescription("Ebook International2014");   //appears the same in Notification bar while downloading
				    request.setTitle("Internation2014 Ebook");                 
				    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
				        request.allowScanningByMediaScanner();
				        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				    }
				    request.setDestinationInExternalPublicDir(Location, "International2014 Ebook");
				 
				    // get download service and enqueue file
				    DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				    manager.enqueue(request);
		        } 
		       
		        }
		        Intent intent_name = new Intent();
	            intent_name.setClass(getApplicationContext(),ChoosePDFActivity.class);
	            finish();
	            startActivity(intent_name);
	            
				
				
             
                }
            };
                 };
        splashTread.start();
    }
							
			
 

			private Boolean isDownloadManagerAvailable(Context context) {
				try {
			        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.GINGERBREAD) {
			            return false;
			        }
			        Intent intent = new Intent(Intent.ACTION_MAIN);
			        intent.addCategory(Intent.CATEGORY_LAUNCHER);
			        intent.setClassName("com.android.providers.downloads.ui","com.android.providers.downloads.ui.DownloadList");
			        List <ResolveInfo> list = context.getPackageManager().queryIntentActivities(intent,
			                PackageManager.MATCH_DEFAULT_ONLY);
			        return list.size() > 0;
			    } catch (Exception e) {
			        return false;
			    }
				
			}
      
   
   
        
        
 
 
    /**
     * Showing Dialog
     * */
    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
        case progress_bar_type: // we set this to 0
            pDialog = new ProgressDialog(this);
            pDialog.setMessage("Downloading file. Please wait...     This might take atleast 1-5 minutes depending on your internet speed.");
            pDialog.setIndeterminate(false);
            pDialog.setMax(100);
            pDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
            pDialog.setCancelable(true);
            pDialog.show();
            return pDialog;
        default:
            return null;
        }
    }
 
    /**
     * Background Async Task to download file
     * */
    class DownloadFileFromURL extends AsyncTask<String, String, String> {
    	
        /**
         * Before starting background thread
         * Show Progress Bar Dialog
         * */
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(progress_bar_type);
         
        	  
                    }
        
 
        /**
         * Downloading file in background thread
         * */
        @Override
        protected String doInBackground(String... f_url) {
            int count;
            try {
                URL url = new URL(f_url[0]);
                URLConnection conection = url.openConnection();
                conection.connect();
                // this will be useful so that you can show a tipical 0-100% progress bar
                int lenghtOfFile = conection.getContentLength();
 
                // download the file
                InputStream input = new BufferedInputStream(url.openStream(), 8192);
 
                // Output stream
                OutputStream output = new FileOutputStream(Environment.getExternalStorageDirectory().toString() + "/GOD/check.pdf" );
 
                byte data[] = new byte[1024];
 
                long total = 0;
 
                while ((count = input.read(data)) != -1) {
                    total += count;
                    // publishing the progress....
                    // After this onProgressUpdate will be called
                    publishProgress(""+(int)((total*100)/lenghtOfFile));
 
                    // writing data to file
                    output.write(data, 0, count);
                }
 
                // flushing output
                output.flush();
 
                // closing streams
                output.close();
                input.close();
 
            } catch (Exception e) {
                Log.e("Error: ", e.getMessage());
            }
 
            return null;
        }
 
        /**
         * Updating progress bar
         * */
        protected void onProgressUpdate(String... progress) {
            // setting progress percentage
            pDialog.setProgress(Integer.parseInt(progress[0]));
       }
 
        /**
         * After completing background task
         * Dismiss the progress dialog
         * **/
        @Override
        protected void onPostExecute(String file_url) {
            // dismiss the dialog after the file was downloaded
            dismissDialog(progress_bar_type);
            
           
    
           
        }
 
    }
}