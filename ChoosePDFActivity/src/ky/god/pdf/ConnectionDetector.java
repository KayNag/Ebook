package ky.god.pdf;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class ConnectionDetector {

	ConnectivityManager connectivity;
	    private Context _context;
	     
	    public ConnectionDetector(Context context){
	        this._context = context;
	    }
	 
	    public boolean isConnectingToInternet(){
	         connectivity = (ConnectivityManager) _context.getSystemService(Context.CONNECTIVITY_SERVICE);
	          if (connectivity != null) 
	          {
	              NetworkInfo[] info = connectivity.getAllNetworkInfo();
	              if (info != null) 
	                  for (int i = 0; i < info.length; i++) 
	                      if (info[i].getState() == NetworkInfo.State.CONNECTED)
	                      {
	                          return true;
	                      }
	 
	          }
	          return false;
	    }
	    
	    public void internet() {
			 if (connectivity == null) {
				    showAlertDialog(_context, "No Internet Connection",
                           "You don't have internet connection.", false);
				   
               }
			
		}
	    private void showAlertDialog(Context context, String title, String message, Boolean status) {
			final AlertDialog alertDialog = new AlertDialog.Builder(context).create();
			 
	        // Setting Dialog Title
	        alertDialog.setTitle(title);
	 
	        // Setting Dialog Message
	        alertDialog.setMessage(message);
	         
	        // Setting alert dialog icon
	        alertDialog.setIcon((status) ? R.drawable.success : R.drawable.fail);
	 
	        // Setting OK Button
	        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
	            public void onClick(DialogInterface dialog, int which) {
	            	alertDialog.dismiss();
	            	
	            }
	        });
	 
	        // Showing Alert Message
	        alertDialog.show();
			
			// TODO Auto-generated method stub
			
		};
    

}
