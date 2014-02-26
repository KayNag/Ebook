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
 
    // File url to download
//    private static String file_url = "http://api.androidhive.info/progressdialog/hive.jpg";
    private static String file_uae = "http://gulfoilfielddirectory.com/ebook/pdf/mainbook.pdf";
    private static String file_bahrain = "http://gulfoilfielddirectory.com/ebook/pdf/bahrain.pdf";
    private static String file_oman = "http://gulfoilfielddirectory.com/ebook/pdf/oman.pdf";
    private static String file_qatar = "http://gulfoilfielddirectory.com/ebook/pdf/qatar.pdf";
    private static String file_Houston = "http://gulfoilfielddirectory.com/ebook/pdf/houston.pdf";
    private static String file_Iran = "http://gulfoilfielddirectory.com/ebook/pdf/IRAN%20CLS%20&%20LISTINGS.pdf";
    private static String file_Iraq = "http://gulfoilfielddirectory.com/ebook/pdf/IRAQ%20CLS%20&%20LISTINGS.pdf";
    private static String file_International = "http://gulfoilfielddirectory.com/ebook/pdf/international.pdf";
    private static String file_saudi = "http://gulfoilfielddirectory.com/ebook/pdf/saudi.pdf";
    private static String file_kuwait = "http://gulfoilfielddirectory.com/ebook/pdf/kuwait.pdf";
    private static String file_yemen = "http://gulfoilfielddirectory.com/ebook/pdf/YEMEN%20CLS%20&%20LISTINGS.pdf";
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
		      	 
		              
		        }  else{
		        
		       // new DownloadFileFromURL().execute(file_yemen);
		        String DownloadUrl = "http://gulfoilfielddirectory.com/ebook/pdf/YEMEN%20CLS%20&%20LISTINGS.pdf";
			    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(DownloadUrl));
			    request.setDescription("Ebook Yemen");   //appears the same in Notification bar while downloading
			    request.setTitle("Yemen Ebook");                 
			    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			        request.allowScanningByMediaScanner();
			        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
			    }
			    request.setDestinationInExternalPublicDir(Location, "Yemen Ebook");
			 
			    // get download service and enqueue file
			    DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
			    manager.enqueue(request);
		        }
		        
		        File myFileuae = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/Uae Ebook");  
		        if (myFileuae.exists())  
		        {  
		      	 Log.d(file_uae, "UAE Ebook installed");
		              
		        }  else{
		        
		        	String DownloadUrl = "http://gulfoilfielddirectory.com/ebook/pdf/mainbook.pdf";
				    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(DownloadUrl));
				    request.setDescription("Ebook UAE");   //appears the same in Notification bar while downloading
				    request.setTitle("UAE Ebook");                 
				    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
				        request.allowScanningByMediaScanner();
				        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				    }
				    request.setDestinationInExternalPublicDir(Location, "Uae Ebook");
				 
				    // get download service and enqueue file
				    DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				    manager.enqueue(request);
		        }
		        File myFilebahrain = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/Bahrain Ebook");  
		        if (myFilebahrain.exists())  
		        {  
		        	Log.d(file_bahrain,"Bahrain Ebook installed");
		              
		        }  else{
		        
		        	String DownloadUrl = "http://gulfoilfielddirectory.com/ebook/pdf/bahrain.pdf";
				    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(DownloadUrl));
				    request.setDescription("Ebook Bahrain");   //appears the same in Notification bar while downloading
				    request.setTitle("Bahrain Ebook");                 
				    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
				        request.allowScanningByMediaScanner();
				        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				    }
				    request.setDestinationInExternalPublicDir(Location, "Bahrain Ebook");
				 
				    // get download service and enqueue file
				    DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				    manager.enqueue(request);
		        }
		        File myFilehouston = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/Houston Ebook");  
		        if (myFilehouston.exists())  
		        {  
		      	Log.d(file_Houston, "Houston Ebook installed");
		              
		        }  else{
		        
		        	String DownloadUrl = "http://gulfoilfielddirectory.com/ebook/pdf/houston.pdf";
				    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(DownloadUrl));
				    request.setDescription("Ebook Houston");   //appears the same in Notification bar while downloading
				    request.setTitle("Houston Ebook");                 
				    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
				        request.allowScanningByMediaScanner();
				        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				    }
				    request.setDestinationInExternalPublicDir(Location, "Houston Ebook");
				 
				    // get download service and enqueue file
				    DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				    manager.enqueue(request);
		        }
		        File myFileiran = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/Iran Ebook");  
		        if (myFileiran.exists())  
		        {  
		      	 Log.d(file_Iran, "Iran Ebook installed");
		              
		        }  else{
		        
		        	String DownloadUrl = "http://gulfoilfielddirectory.com/ebook/pdf/IRAN%20CLS%20&%20LISTINGS.pdf";
				    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(DownloadUrl));
				    request.setDescription("Ebook Iran");   //appears the same in Notification bar while downloading
				    request.setTitle("Iran Ebook");                 
				    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
				        request.allowScanningByMediaScanner();
				        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				    }
				    request.setDestinationInExternalPublicDir(Location, "Iran Ebook");
				 
				    // get download service and enqueue file
				    DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				    manager.enqueue(request);
		        }
		        File myFileiraq = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/Iraq Ebook");  
		        if (myFileiraq.exists())  
		        {  
		      	 Log.d(file_Iraq, "Iraq Ebook installed");
		              
		        }  else{
		        
		        	String DownloadUrl = "http://gulfoilfielddirectory.com/ebook/pdf/IRAQ%20CLS%20&%20LISTINGS.pdf";
				    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(DownloadUrl));
				    request.setDescription("Ebook Iraq");   //appears the same in Notification bar while downloading
				    request.setTitle("Iraq Ebook");                 
				    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
				        request.allowScanningByMediaScanner();
				        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				    }
				    request.setDestinationInExternalPublicDir(Location, "Iraq Ebook");
				 
				    // get download service and enqueue file
				    DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				    manager.enqueue(request);
		        }
		        File myFilekuwait = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/Kuwait Ebook");  
		        if (myFilekuwait.exists())  
		        {  
		      	 Log.d(file_kuwait, "Kuwait Ebook installed");
		              
		        }  else{
		        
		        	String DownloadUrl = "http://gulfoilfielddirectory.com/ebook/pdf/kuwait.pdf";
				    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(DownloadUrl));
				    request.setDescription("Ebook Iraq");   //appears the same in Notification bar while downloading
				    request.setTitle("Iraq Ebook");                 
				    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
				        request.allowScanningByMediaScanner();
				        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				    }
				    request.setDestinationInExternalPublicDir(Location, "Kuwait Ebook");
				 
				    // get download service and enqueue file
				    DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				    manager.enqueue(request);
		        }   
		        
		        File myFileoman = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/Oman Ebook");  
		        if (myFileoman.exists())  
		        {  
		      	 Log.d(file_oman, "Oman Ebook installed");
		              
		        }  else{
		        
		        	String DownloadUrl = "http://gulfoilfielddirectory.com/ebook/pdf/oman.pdf";
				    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(DownloadUrl));
				    request.setDescription("Ebook Oman");   //appears the same in Notification bar while downloading
				    request.setTitle("Oman Ebook");                 
				    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
				        request.allowScanningByMediaScanner();
				        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				    }
				    request.setDestinationInExternalPublicDir(Location, "Oman Ebook");
				 
				    // get download service and enqueue file
				    DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				    manager.enqueue(request);
		        }  
		        File myFileqatar = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/Qatar Ebook");  
		        if (myFileqatar.exists())  
		        {  
		      	 Log.d(file_qatar, "Qatar Ebook installed");
		              
		        }  else{
		        
		        	String DownloadUrl = "http://gulfoilfielddirectory.com/ebook/pdf/qatar.pdf";
				    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(DownloadUrl));
				    request.setDescription("Ebook Qatar");   //appears the same in Notification bar while downloading
				    request.setTitle("Qatar Ebook");                 
				    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
				        request.allowScanningByMediaScanner();
				        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				    }
				    request.setDestinationInExternalPublicDir(Location, "Qatar Ebook");
				 
				    // get download service and enqueue file
				    DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				    manager.enqueue(request);
		        } 
		        File myFilesaudi = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/Saudi Ebook");  
		        if (myFilesaudi.exists())  
		        {  
		      	 Log.d(file_saudi, "Saudi Ebook installed");
		              
		        }  else{
		        
		        	String DownloadUrl = "http://gulfoilfielddirectory.com/ebook/pdf/saudi.pdf";
				    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(DownloadUrl));
				    request.setDescription("Ebook Saudi");   //appears the same in Notification bar while downloading
				    request.setTitle("Saudi Ebook");                 
				    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
				        request.allowScanningByMediaScanner();
				        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				    }
				    request.setDestinationInExternalPublicDir(Location, "Saudi Ebook");
				 
				    // get download service and enqueue file
				    DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				    manager.enqueue(request);
		        } 
		        File myFileinternational = new File (Environment.getExternalStorageDirectory().toString() + "/Android/obb/ky.god.pdf/International Ebook");  
		        if (myFileinternational.exists())  
		        {  
		      	 Log.d(file_International, "International Ebook installed");
		              
		        }  else{
		        
		        	String DownloadUrl = "http://gulfoilfielddirectory.com/ebook/pdf/international.pdf";
				    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(DownloadUrl));
				    request.setDescription("Ebook International");   //appears the same in Notification bar while downloading
				    request.setTitle("Internation Ebook");                 
				    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
				        request.allowScanningByMediaScanner();
				        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				    }
				    request.setDestinationInExternalPublicDir(Location, "International Ebook");
				 
				    // get download service and enqueue file
				    DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				    manager.enqueue(request);
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