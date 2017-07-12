
package edu.gsu.httpscs.yan2017summer;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.NotificationCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import edu.gsu.httpscs.yan2017summer.R;
import edu.gsu.httpscs.yan2017summer.adapter.AdvanceListViewAdapter;
import edu.gsu.httpscs.yan2017summer.adapter.ViewFragmentStateAdapter;
import edu.gsu.httpscs.yan2017summer.fragment.GreenFragment;
import edu.gsu.httpscs.yan2017summer.fragment.BlueFragment;
import edu.gsu.httpscs.yan2017summer.fragment.RedFragment;

    public class Quiz4AdvanceListViewActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

        private ListView listView;
        private ArrayList<String> listResult;
        private NotificationCompat.Builder mBuilder;
        private int notifyId = 100;
        private NotificationManager mNotificationManager;
        private ArrayList<Fragment> fragmentList = new ArrayList<Fragment>();

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_advance);
            listResult = new ArrayList<String>();
            mNotificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
            createFakeResult();
            //initialView();
        }

        private void createFakeResult() {
            listResult.add("Hello!");
            listResult.add("Hello! How are you?");
            listResult.add("Good! Thank you! And you?");
            listResult.add("Good!");
            listResult.add("Good!");
            listResult.add("Good!");
            listResult.add("Good!");
            listResult.add("Good!");
            listResult.add("Good!");
            listResult.add("Good!");
            listResult.add("Good!");
            listResult.add("Good!");
            listResult.add("Good!");
            listResult.add("Good!");
            listResult.add("Good!");
            listResult.add("Good!");
            listResult.add("Good!");
        }

        //This is called in the Oncreate of this page
//        private void initialView() {
//            listView = (ListView) findViewById(R.id.advance_lv);
//            View view = getLayoutInflater().inflate(R.layout.list_view_header,null);
//
//            LinearLayout listViewHeader = (LinearLayout)view.findViewById(R.id.list_view_header);
//            AdvanceListViewAdapter listViewAdapter = new AdvanceListViewAdapter(this,listResult);
//            ViewPager viewPager = (ViewPager) view.findViewById(R.id.lv_header_vp);
//
//            ViewFragmentStateAdapater viewPagerAdapter= new ViewFragmentPagerAdapater(this.getSupportFragmentManager());
//            fragmentList.add(new RedFragment());
//            fragmentList.add(new BlueFragment());
//            fragmentList.add(new GreenFragment());
//            viewPagerAdapter.setContent(fragmentList);
//            viewPager.setAdapter(viewPagerAdapter);
//
//            listView.addHeaderView(listViewHeader);
//
//            TextView tv = new TextView(this);
//            tv.setText("We have no more content.");
//            tv.setTextSize(28);
//            tv.setGravity(Gravity.CENTER);
//            listView.addFooterView(tv);
//
//            listView.setAdapter(listViewAdapter);
//            listView.setOnItemClickListener(this);
//
//        }


        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(this,"listView was clicked at position:"+position,Toast.LENGTH_LONG).show();
            Log.d("testListViewActivty",String.valueOf(position));
            initNotify();
            switch (position){
                case 1:
                    showNotify();
                    break;
                case 2:
                    showBigStyleNotify();
                    break;
                default:
            }
        }

        private void initNotify(){
            mBuilder = new NotificationCompat.Builder(this);
            mBuilder.setContentTitle("Title")
                    .setContentText("Text")
                    .setContentIntent(getDefalutIntent(Notification.FLAG_AUTO_CANCEL))
                    .setNumber(10)
                    .setTicker("Ticker")
                    .setWhen(System.currentTimeMillis())
                    .setPriority(Notification.PRIORITY_DEFAULT)
                    .setAutoCancel(true)
                    .setOngoing(false)
                    .setDefaults(Notification.DEFAULT_SOUND)
                    .setDefaults(Notification.DEFAULT_VIBRATE)
                    //Notification.DEFAULT_ALL  Notification.DEFAULT_SOUND  // requires VIBRATE permission
                    .setSmallIcon(R.mipmap.ic_launcher);
        }

        public void showBigStyleNotify() {
            NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
            String[] events = new String[]{"Line1", "Line2", "Line3", "Line4", "Line5"};
            // Sets a title for the Inbox style big view
            inboxStyle.setBigContentTitle("BigContentTitle");
            // Moves events into the big view
            for (int i=0; i < events.length; i++) {
                inboxStyle.addLine(events[i]);
            }
            inboxStyle.setBuilder(mBuilder);
            mBuilder.setStyle(inboxStyle);
            //////////////////////////////////////////
//        NotificationCompat.BigPictureStyle bigPictureStyle= new NotificationCompat.BigPictureStyle();
//        mBuilder.setStyle(bigPictureStyle);
//        bigPictureStyle.setBuilder(mBuilder);
//        bigPictureStyle.setBigContentTitle("BigContentTitle");
//        bigPictureStyle.setSummaryText("SummaryText");
//        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.mipmap.pic2);
//        bigPictureStyle.bigPicture(bitmap1);
//        mBuilder.setStyle(bigPictureStyle);

            mNotificationManager.notify(notifyId, mBuilder.build());
        }

        public void showNotify(){
            mBuilder.setContentTitle("Title")
                    .setContentText("Text")
//				.setNumber(number)
                    .setTicker("Ticker");
            mNotificationManager.notify(notifyId, mBuilder.build());
        }
        public PendingIntent getDefalutIntent(int flags){
            PendingIntent pendingIntent= PendingIntent.getActivity(this, 1, new Intent(), flags);
            return pendingIntent;
        }
    }

//}
