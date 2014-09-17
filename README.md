Android-PreferenceDemo
======================

Sample app to demonstrate how to use Android SharedPreferences in easy way
-It uses apply() instead of commit()
-apply() is asynchronus save, doesn't return anything, it update value in memory first & changes are written to disk later asynchronusly.
-commit() is synchronus save, it return true/false based on outcome. Changes are written to disk synchronusly
-Using singelton class to access/update SharedPreferences