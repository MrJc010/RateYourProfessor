package com.group6.scamproject_131class;

/**
 * Created by Green Face on 5/11/2017.
 */

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import java.io.InputStream;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

//import org.apache.http.HttpEntity;
//import org.apache.http.HttpResponse;
//import org.apache.http.NameValuePair;
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.entity.UrlEncodedFormEntity;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.impl.client.DefaultHttpClient;
//import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Green Face on 4/22/2017.
 */

public class Signup extends Activity {

    DatabaseHelper helper = new DatabaseHelper(this);
    StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        final CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox3);
        Button button = (Button) findViewById(R.id.bSingupNext);
        button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {

                String result = null;
                InputStream is = null;
                EditText editText = (EditText)findViewById(R.id.Sfirstname);
                String Sfirstname = editText.getText().toString();
                EditText editText1 = (EditText)findViewById(R.id.Slastname);
                String Slastname = editText1.getText().toString();
                EditText editText2 = (EditText)findViewById(R.id.Semail);
                String Semail = editText2.getText().toString();
                EditText editText3 = (EditText)findViewById(R.id.Sid);
                String Sid = editText3.getText().toString();
                EditText editText4 = (EditText)findViewById(R.id.Susername);
                String Susername = editText4.getText().toString();
                EditText editText5 = (EditText)findViewById(R.id.Spassword);
                String Spassword = editText5.getText().toString();
                EditText editText6 = (EditText)findViewById(R.id.Srepassword);
                String Srepassword = editText6.getText().toString();
                Account a = new Account();
                a.setEmail(Semail);
                a.setUsername(Susername);
                a.setPassword(Spassword);
                helper.insertAccount(a);
//                ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
//                nameValuePairs.add(new BasicNameValuePair("first_name",Sfirstname));
//                nameValuePairs.add(new BasicNameValuePair("last_name",Slastname));
//                nameValuePairs.add(new BasicNameValuePair("email",Semail));
//                nameValuePairs.add(new BasicNameValuePair("id",Sid));
//                nameValuePairs.add(new BasicNameValuePair("username",Susername));
//                nameValuePairs.add(new BasicNameValuePair("password",Spassword));
//                if(!Srepassword.equals(Spassword)){
//                    Toast.makeText(getApplicationContext(), "Password don not match!",Toast.LENGTH_SHORT).show();
//                } else {
//                    StrictMode.setThreadPolicy(policy);
//                    //http post
//                    try {
//                        HttpClient httpclient = new DefaultHttpClient();
//                        HttpPost httppost = new HttpPost("http://10.0.2.2/Data/insert.php");
//                        httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
//                        HttpResponse response = httpclient.execute(httppost);
//                        HttpEntity entity = response.getEntity();
//                        is = entity.getContent();
//                    } catch (Exception e) {
//                        Log.e("log_tag", "Error in http connection " + e.toString());
//                        Toast.makeText(getApplicationContext(), "Connection fail", Toast.LENGTH_SHORT).show();
//
//                    }
//                    //convert response to string
//                    try {
//                        BufferedReader reader = new BufferedReader(new InputStreamReader(is, "iso-8859-1"), 8);
//                        StringBuilder sb = new StringBuilder();
//                        String line = null;
//                        while ((line = reader.readLine()) != null) {
//                            sb.append(line + "\n");
//
//                            Intent i = new Intent(getBaseContext(), Signup.class);
//                            startActivity(i);
//
//                        }
//                        is.close();
////                        result = sb.toString();
////                        if (result.contains("Information has been saved!")) {
////                            Intent intent1 = new Intent(Signup.this, TakenClass.class);
////                            startActivity(intent1);
////                        }
//                    } catch (Exception e) {
//                        Log.e("log_tag", "Error converting result " + e.toString());
//                    }
//                    try {
//                        JSONObject json_data = new JSONObject(result);
//                        CharSequence w = (CharSequence) json_data.get("re");
//                        Toast.makeText(getApplicationContext(), w, Toast.LENGTH_SHORT).show();
//                    } catch (JSONException e) {
//                        Log.e("log_tag", "Error parsing data " + e.toString());
//                        Toast.makeText(getApplicationContext(), "JsonArray fail", Toast.LENGTH_SHORT).show();
//                    }
//                }
            }

        });
    }

//    public void onClick(View view){
//        switch (view.getId()){
//            case R.id.bTemrsConditon:
//                Intent intent = new Intent(Signup.this, TermsConditon.class);
//                startActivity(intent);
//                break;
//        }
//    }
}


