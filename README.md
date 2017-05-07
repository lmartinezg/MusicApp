#Udacity Android Basics Nanodegree. Music App Structure exercise

In this exercise, only navigation between activities need to be implemented. A real Music Player functionality is not requested.

Navigation has to be implemented by explicit intents in Java code, not by using `onClick` attributes in views.
 
In the Main Activity there is a list of options, and by tapping each one, a new Activity is presented. Options include Now playing, Artists, Albums, Playlists, Podcasts and Search.

Now Playing goes to a standard Music Player activity with detailed info about the track being played and standard playback buttons. Playing functionality will be implemented by using the [Android MediaPlayer class](https://developer.android.com/reference/android/media/MediaPlayer.html)

Search shows an activity with EditText views to enter search criteria and by tapping the Search button a new activity will be presented with the results.

Media will be populated from the device by using the [Android Content Resolver class](https://developer.android.com/reference/android/content/ContentResolver.html)
 
For this exercise, result lists have been implemented by repeating TextViews, but in real use, [Android ListView class](https://developer.android.com/reference/android/widget/ListView.html) and [Android ListAdapter interface](https://developer.android.com/reference/android/widget/ListAdapter.html) should be used to acomplish the task. 

   
