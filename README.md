This is an extension to the Popular Movies app which is built in stage 1

Stage 1 app will:

• Upon launch, present the user with an grid arrangement of movie posters.<br>
• Allow the user to change sort order via a setting: The sort order can be by most popular, or by top rated<br>
• Allow the user to tap on a movie poster and transition to a details screen with additional information such as:<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;⚬ original title<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;⚬ movie poster image-background poster<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;⚬ A plot synopsis (called overview in the api)<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;⚬ user rating (called vote_average in the api)<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;⚬ release date<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;⚬ original language<br><br>
Stage 2 app will:

&nbsp;&nbsp;&nbsp;• Modify the existing sorting criteria for the main view to include an additional pivot to show their favorites collection.<br>
&nbsp;&nbsp;&nbsp;• In Details screen of the selected movie:<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;⚬ Allow users to read reviews of a selected movie<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;⚬ Allow users to view and play trailers (either in the youtube app or a web browser).<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;⚬ Allow users to see the cast of a selected movie<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;⚬ Allow users to mark a movie as a favorite in the details view by tapping a button (star).<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;⚬ Allow users to share the movie trailer link to social media or any other sharing platform on long press<br><br>
What Will I Learn After Stage 2?<br><br>
&nbsp;&nbsp;&nbsp;•Make use of Android Architecture Components (Room, LiveData, ViewModel and Lifecycle) to create a robust an efficient &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;application.<br>
&nbsp;&nbsp;&nbsp;•Create a database using Room to store the names and ids of the user's favorite movies (and optionally, the rest of the &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;information needed to display their favorites collection while offline).<br><br>
API Key<br>
The movie information uses The Movie Database (TMDb) API. To make your app work, you have to enter your own API key into build.gradle file.<br>

API_KEY="Api Key"
