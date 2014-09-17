Android-PreferenceDemo
======================

Sample app to demonstrate how to use Android SharedPreferences in easy way.
--------------------------------------------------------------------------
<ul>
<li>Using singelton class to access/update SharedPreferences</li>
<li>No need to pass context always for read/write SharedPreferences</li>
<li>It uses apply() instead of commit()</li>
<li>apply() is asynchronus save, doesn't return anything, it update value in memory first & changes are written to disk later asynchronusly.</li>
<li>commit() is synchronus save, it return true/false based on outcome. Changes are written to disk synchronusly</li>
</ul>
<a href="http://developer.android.com/reference/android/content/SharedPreferences.Editor.html">You can see more details here</a>