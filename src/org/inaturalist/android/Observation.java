// BEGIN GENERATED BY /Users/kueda/projects/eclipse/workspace/iNaturalist/rails2android.rb AT Fri Dec 09 22:31:19 -0800 2011
package org.inaturalist.android;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.provider.BaseColumns;

public class Observation implements BaseColumns, Serializable {
    public Integer _id;
    public Timestamp _created_at;
    public Timestamp _synced_at;
    public Timestamp _updated_at;
    public Timestamp created_at;
    public String description;
    public String geoprivacy;
    public Integer iconic_taxon_id;
    public String iconic_taxon_name;
    public Integer id;
    public Boolean id_please;
    public Double latitude;
    public Double longitude;
    public Timestamp observed_on;
    public String observed_on_string;
    public String place_guess;
    public Integer positional_accuracy;
    public Double private_latitude;
    public Double private_longitude;
    public Integer private_positional_accuracy;
    public String quality_grade;
    public String species_guess;
    public Integer taxon_id;
    public Timestamp time_observed_at;
    public Timestamp updated_at;
    public Integer user_id;
    public String user_login;


    public static final String TABLE_NAME = "observations";
    public static final int OBSERVATIONS_URI_CODE = 1279;
    public static final int OBSERVATION_ID_URI_CODE = 1164;
    public static HashMap<String, String> PROJECTION_MAP;
    public static final String AUTHORITY = "org.inaturalist.android.observation";
    public static final Uri    CONTENT_URI = Uri.parse("content://" + AUTHORITY + "/observations");
    public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.google.observation";
    public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.google.observation";
    public static final String DEFAULT_SORT_ORDER = "observed_on DESC, _id DESC";
    public static final String _CREATED_AT = "_created_at";
    public static final String _SYNCED_AT = "_synced_at";
    public static final String _UPDATED_AT = "_updated_at";
    public static final String CREATED_AT = "created_at";
    public static final String DESCRIPTION = "description";
    public static final String GEOPRIVACY = "geoprivacy";
    public static final String ICONIC_TAXON_ID = "iconic_taxon_id";
    public static final String ICONIC_TAXON_NAME = "iconic_taxon_name";
    public static final String ID = "id";
    public static final String ID_PLEASE = "id_please";
    public static final String LATITUDE = "latitude";
    public static final String LONGITUDE = "longitude";
    public static final String OBSERVED_ON = "observed_on";
    public static final String OBSERVED_ON_STRING = "observed_on_string";
    public static final String PLACE_GUESS = "place_guess";
    public static final String POSITIONAL_ACCURACY = "positional_accuracy";
    public static final String PRIVATE_LATITUDE = "private_latitude";
    public static final String PRIVATE_LONGITUDE = "private_longitude";
    public static final String PRIVATE_POSITIONAL_ACCURACY = "private_positional_accuracy";
    public static final String QUALITY_GRADE = "quality_grade";
    public static final String SPECIES_GUESS = "species_guess";
    public static final String TAXON_ID = "taxon_id";
    public static final String TIME_OBSERVED_AT = "time_observed_at";
    public static final String UPDATED_AT = "updated_at";
    public static final String USER_ID = "user_id";
    public static final String USER_LOGIN = "user_login";


    public static final String[] PROJECTION = new String[] {
        Observation._ID,
        Observation._CREATED_AT,
        Observation._SYNCED_AT,
        Observation._UPDATED_AT,
        Observation.CREATED_AT,
        Observation.DESCRIPTION,
        Observation.GEOPRIVACY,
        Observation.ICONIC_TAXON_ID,
        Observation.ICONIC_TAXON_NAME,
        Observation.ID,
        Observation.ID_PLEASE,
        Observation.LATITUDE,
        Observation.LONGITUDE,
        Observation.OBSERVED_ON,
        Observation.OBSERVED_ON_STRING,
        Observation.PLACE_GUESS,
        Observation.POSITIONAL_ACCURACY,
        Observation.PRIVATE_LATITUDE,
        Observation.PRIVATE_LONGITUDE,
        Observation.PRIVATE_POSITIONAL_ACCURACY,
        Observation.QUALITY_GRADE,
        Observation.SPECIES_GUESS,
        Observation.TAXON_ID,
        Observation.TIME_OBSERVED_AT,
        Observation.UPDATED_AT,
        Observation.USER_ID,
        Observation.USER_LOGIN
    };

    static {
        PROJECTION_MAP = new HashMap<String, String>();
        PROJECTION_MAP.put(Observation._ID, Observation._ID);
        PROJECTION_MAP.put(Observation._CREATED_AT, Observation._CREATED_AT);
        PROJECTION_MAP.put(Observation._SYNCED_AT, Observation._SYNCED_AT);
        PROJECTION_MAP.put(Observation._UPDATED_AT, Observation._UPDATED_AT);
        PROJECTION_MAP.put(Observation.CREATED_AT, Observation.CREATED_AT);
        PROJECTION_MAP.put(Observation.DESCRIPTION, Observation.DESCRIPTION);
        PROJECTION_MAP.put(Observation.GEOPRIVACY, Observation.GEOPRIVACY);
        PROJECTION_MAP.put(Observation.ICONIC_TAXON_ID, Observation.ICONIC_TAXON_ID);
        PROJECTION_MAP.put(Observation.ICONIC_TAXON_NAME, Observation.ICONIC_TAXON_NAME);
        PROJECTION_MAP.put(Observation.ID, Observation.ID);
        PROJECTION_MAP.put(Observation.ID_PLEASE, Observation.ID_PLEASE);
        PROJECTION_MAP.put(Observation.LATITUDE, Observation.LATITUDE);
        PROJECTION_MAP.put(Observation.LONGITUDE, Observation.LONGITUDE);
        PROJECTION_MAP.put(Observation.OBSERVED_ON, Observation.OBSERVED_ON);
        PROJECTION_MAP.put(Observation.OBSERVED_ON_STRING, Observation.OBSERVED_ON_STRING);
        PROJECTION_MAP.put(Observation.PLACE_GUESS, Observation.PLACE_GUESS);
        PROJECTION_MAP.put(Observation.POSITIONAL_ACCURACY, Observation.POSITIONAL_ACCURACY);
        PROJECTION_MAP.put(Observation.PRIVATE_LATITUDE, Observation.PRIVATE_LATITUDE);
        PROJECTION_MAP.put(Observation.PRIVATE_LONGITUDE, Observation.PRIVATE_LONGITUDE);
        PROJECTION_MAP.put(Observation.PRIVATE_POSITIONAL_ACCURACY, Observation.PRIVATE_POSITIONAL_ACCURACY);
        PROJECTION_MAP.put(Observation.QUALITY_GRADE, Observation.QUALITY_GRADE);
        PROJECTION_MAP.put(Observation.SPECIES_GUESS, Observation.SPECIES_GUESS);
        PROJECTION_MAP.put(Observation.TAXON_ID, Observation.TAXON_ID);
        PROJECTION_MAP.put(Observation.TIME_OBSERVED_AT, Observation.TIME_OBSERVED_AT);
        PROJECTION_MAP.put(Observation.UPDATED_AT, Observation.UPDATED_AT);
        PROJECTION_MAP.put(Observation.USER_ID, Observation.USER_ID);
        PROJECTION_MAP.put(Observation.USER_LOGIN, Observation.USER_LOGIN);

    }

    public Observation() {}

    public Observation(Cursor c) {
        if (c.getPosition() == -1) {
            c.moveToFirst();
        }
        BetterCursor bc = new BetterCursor(c);
        this._id = bc.getInt(_ID);
        this._created_at = bc.getTimestamp(_CREATED_AT);
        this._synced_at = bc.getTimestamp(_SYNCED_AT);
        this._updated_at = bc.getTimestamp(_UPDATED_AT);
        this.created_at = bc.getTimestamp(CREATED_AT);
        this.description = bc.getString(DESCRIPTION);
        this.geoprivacy = bc.getString(GEOPRIVACY);
        this.iconic_taxon_id = bc.getInteger(ICONIC_TAXON_ID);
        this.iconic_taxon_name = bc.getString(ICONIC_TAXON_NAME);
        this.id = bc.getInteger(ID);
        this.id_please = bc.getBoolean(ID_PLEASE);
        this.latitude = bc.getDouble(LATITUDE);
        this.longitude = bc.getDouble(LONGITUDE);
        this.observed_on = bc.getTimestamp(OBSERVED_ON);
        this.observed_on_string = bc.getString(OBSERVED_ON_STRING);
        this.place_guess = bc.getString(PLACE_GUESS);
        this.positional_accuracy = bc.getInteger(POSITIONAL_ACCURACY);
        this.private_latitude = bc.getDouble(PRIVATE_LATITUDE);
        this.private_longitude = bc.getDouble(PRIVATE_LONGITUDE);
        this.private_positional_accuracy = bc.getInteger(PRIVATE_POSITIONAL_ACCURACY);
        this.quality_grade = bc.getString(QUALITY_GRADE);
        this.species_guess = bc.getString(SPECIES_GUESS);
        this.taxon_id = bc.getInteger(TAXON_ID);
        this.time_observed_at = bc.getTimestamp(TIME_OBSERVED_AT);
        this.updated_at = bc.getTimestamp(UPDATED_AT);
        this.user_id = bc.getInteger(USER_ID);
        this.user_login = bc.getString(USER_LOGIN);

    }

    public Observation(BetterJSONObject o) {
        this._created_at = o.getTimestamp("_created_at");
        this._synced_at = o.getTimestamp("_synced_at");
        this._updated_at = o.getTimestamp("_updated_at");
        this.created_at = o.getTimestamp("created_at");
        this.description = o.getString("description");
        this.geoprivacy = o.getString("geoprivacy");
        this.iconic_taxon_id = o.getInteger("iconic_taxon_id");
        this.iconic_taxon_name = o.getString("iconic_taxon_name");
        this.id = o.getInteger("id");
        this.id_please = o.getBoolean("id_please");
        this.latitude = o.getDouble("latitude");
        this.longitude = o.getDouble("longitude");
        this.observed_on = o.getTimestamp("observed_on");
        this.observed_on_string = o.getString("observed_on_string");
        this.place_guess = o.getString("place_guess");
        this.positional_accuracy = o.getInteger("positional_accuracy");
        this.private_latitude = o.getDouble("private_latitude");
        this.private_longitude = o.getDouble("private_longitude");
        this.private_positional_accuracy = o.getInteger("private_positional_accuracy");
        this.quality_grade = o.getString("quality_grade");
        this.species_guess = o.getString("species_guess");
        this.taxon_id = o.getInteger("taxon_id");
        this.time_observed_at = o.getTimestamp("time_observed_at");
        this.updated_at = o.getTimestamp("updated_at");
        this.user_id = o.getInteger("user_id");
        this.user_login = o.getString("user_login");

    }

    @Override
    public String toString() {
        return "Observation(id: " + id + ", _id: " + _id + ")";
    }

    public JSONObject toJSONObject() {
        BetterJSONObject bo = new BetterJSONObject();
        bo.put("_created_at", _created_at);
        bo.put("_synced_at", _synced_at);
        bo.put("_updated_at", _updated_at);
        bo.put("created_at", created_at);
        bo.put("description", description);
        bo.put("geoprivacy", geoprivacy);
        bo.put("iconic_taxon_id", iconic_taxon_id);
        bo.put("iconic_taxon_name", iconic_taxon_name);
        bo.put("id", id);
        bo.put("id_please", id_please);
        bo.put("latitude", latitude);
        bo.put("longitude", longitude);
        bo.put("observed_on", observed_on);
        bo.put("observed_on_string", observed_on_string);
        bo.put("place_guess", place_guess);
        bo.put("positional_accuracy", positional_accuracy);
        bo.put("private_latitude", private_latitude);
        bo.put("private_longitude", private_longitude);
        bo.put("private_positional_accuracy", private_positional_accuracy);
        bo.put("quality_grade", quality_grade);
        bo.put("species_guess", species_guess);
        bo.put("taxon_id", taxon_id);
        bo.put("time_observed_at", time_observed_at);
        bo.put("updated_at", updated_at);
        bo.put("user_id", user_id);
        bo.put("user_login", user_login);

        return bo.getJSONObject();
    }

    public Uri getUri() {
        if (_id == null) {
            return null;
        } else {
            return ContentUris.withAppendedId(CONTENT_URI, _id);
        }
    }

    public void merge(Observation observation) {
        if (this._updated_at.before(observation.updated_at)) {
            // overwrite
            this.created_at = observation.created_at;
            this.description = observation.description;
            this.geoprivacy = observation.geoprivacy;
            this.iconic_taxon_id = observation.iconic_taxon_id;
            this.iconic_taxon_name = observation.iconic_taxon_name;
            this.id = observation.id;
            this.id_please = observation.id_please;
            this.latitude = observation.latitude;
            this.longitude = observation.longitude;
            this.observed_on = observation.observed_on;
            this.observed_on_string = observation.observed_on_string;
            this.place_guess = observation.place_guess;
            this.positional_accuracy = observation.positional_accuracy;
            this.private_latitude = observation.private_latitude;
            this.private_longitude = observation.private_longitude;
            this.private_positional_accuracy = observation.private_positional_accuracy;
            this.quality_grade = observation.quality_grade;
            this.species_guess = observation.species_guess;
            this.taxon_id = observation.taxon_id;
            this.time_observed_at = observation.time_observed_at;
            this.updated_at = observation.updated_at;

        } else {
            // set if null
            if (this.created_at == null) { this.created_at = observation.created_at; }
            if (this.description == null) { this.description = observation.description; }
            if (this.geoprivacy == null) { this.geoprivacy = observation.geoprivacy; }
            if (this.iconic_taxon_id == null) { this.iconic_taxon_id = observation.iconic_taxon_id; }
            if (this.iconic_taxon_name == null) { this.iconic_taxon_name = observation.iconic_taxon_name; }
            if (this.id == null) { this.id = observation.id; }
            if (this.id_please == null) { this.id_please = observation.id_please; }
            if (this.latitude == null) { this.latitude = observation.latitude; }
            if (this.longitude == null) { this.longitude = observation.longitude; }
            if (this.observed_on == null) { this.observed_on = observation.observed_on; }
            if (this.observed_on_string == null) { this.observed_on_string = observation.observed_on_string; }
            if (this.place_guess == null) { this.place_guess = observation.place_guess; }
            if (this.positional_accuracy == null) { this.positional_accuracy = observation.positional_accuracy; }
            if (this.private_latitude == null) { this.private_latitude = observation.private_latitude; }
            if (this.private_longitude == null) { this.private_longitude = observation.private_longitude; }
            if (this.private_positional_accuracy == null) { this.private_positional_accuracy = observation.private_positional_accuracy; }
            if (this.quality_grade == null) { this.quality_grade = observation.quality_grade; }
            if (this.species_guess == null) { this.species_guess = observation.species_guess; }
            if (this.taxon_id == null) { this.taxon_id = observation.taxon_id; }
            if (this.time_observed_at == null) { this.time_observed_at = observation.time_observed_at; }
            if (this.updated_at == null) { this.updated_at = observation.updated_at; }

        }
    }

    public ContentValues getContentValues() {
        ContentValues cv = new ContentValues();
        if (_created_at != null) { cv.put(_CREATED_AT, _created_at.getTime()); }
        if (_synced_at != null) { cv.put(_SYNCED_AT, _synced_at.getTime()); }
        if (_updated_at != null) { cv.put(_UPDATED_AT, _updated_at.getTime()); }
        if (created_at != null) { cv.put(CREATED_AT, created_at.getTime()); }
        cv.put(DESCRIPTION, description);
        cv.put(GEOPRIVACY, geoprivacy);
        cv.put(ICONIC_TAXON_ID, iconic_taxon_id);
        cv.put(ICONIC_TAXON_NAME, iconic_taxon_name);
        cv.put(ID, id);
        cv.put(ID_PLEASE, id_please);
        cv.put(LATITUDE, latitude);
        cv.put(LONGITUDE, longitude);
        if (observed_on != null) { cv.put(OBSERVED_ON, observed_on.getTime()); }
        cv.put(OBSERVED_ON_STRING, observed_on_string);
        cv.put(PLACE_GUESS, place_guess);
        cv.put(POSITIONAL_ACCURACY, positional_accuracy);
        cv.put(PRIVATE_LATITUDE, private_latitude);
        cv.put(PRIVATE_LONGITUDE, private_longitude);
        cv.put(PRIVATE_POSITIONAL_ACCURACY, private_positional_accuracy);
        cv.put(QUALITY_GRADE, quality_grade);
        cv.put(SPECIES_GUESS, species_guess);
        cv.put(TAXON_ID, taxon_id);
        if (time_observed_at != null) { cv.put(TIME_OBSERVED_AT, time_observed_at.getTime()); }
        if (updated_at != null) { cv.put(UPDATED_AT, updated_at.getTime()); }
        cv.put(USER_ID, user_id);
        cv.put(USER_LOGIN, user_login);

        return cv;
    }

    public ArrayList<NameValuePair> getParams() {
        final ArrayList<NameValuePair> params = new ArrayList<NameValuePair>();
        if (description != null) { params.add(new BasicNameValuePair("observation[description]", description.toString())); }
        if (geoprivacy != null) { params.add(new BasicNameValuePair("observation[geoprivacy]", geoprivacy.toString())); }
        if (iconic_taxon_id != null) { params.add(new BasicNameValuePair("observation[iconic_taxon_id]", iconic_taxon_id.toString())); }
        if (iconic_taxon_name != null) { params.add(new BasicNameValuePair("observation[iconic_taxon_name]", iconic_taxon_name.toString())); }
        if (id_please != null) { params.add(new BasicNameValuePair("observation[id_please]", id_please.toString())); }
        if (latitude != null) { params.add(new BasicNameValuePair("observation[latitude]", latitude.toString())); }
        if (longitude != null) { params.add(new BasicNameValuePair("observation[longitude]", longitude.toString())); }
        if (observed_on_string != null) { params.add(new BasicNameValuePair("observation[observed_on_string]", observed_on_string.toString())); }
        if (place_guess != null) { params.add(new BasicNameValuePair("observation[place_guess]", place_guess.toString())); }
        if (positional_accuracy != null) { params.add(new BasicNameValuePair("observation[positional_accuracy]", positional_accuracy.toString())); }
        if (private_latitude != null) { params.add(new BasicNameValuePair("observation[private_latitude]", private_latitude.toString())); }
        if (private_longitude != null) { params.add(new BasicNameValuePair("observation[private_longitude]", private_longitude.toString())); }
        if (private_positional_accuracy != null) { params.add(new BasicNameValuePair("observation[private_positional_accuracy]", private_positional_accuracy.toString())); }
        if (quality_grade != null) { params.add(new BasicNameValuePair("observation[quality_grade]", quality_grade.toString())); }
        if (species_guess != null) { params.add(new BasicNameValuePair("observation[species_guess]", species_guess.toString())); }
        if (taxon_id != null) { params.add(new BasicNameValuePair("observation[taxon_id]", taxon_id.toString())); }

        return params;
    }

    public static String sqlCreate() {
        return "CREATE TABLE " + TABLE_NAME + " ("
                + Observation._ID + " INTEGER PRIMARY KEY,"
                + "_created_at INTEGER,"
                + "_synced_at INTEGER,"
                + "_updated_at INTEGER,"
                + "created_at INTEGER,"
                + "description TEXT,"
                + "geoprivacy TEXT,"
                + "iconic_taxon_id INTEGER,"
                + "iconic_taxon_name TEXT,"
                + "id INTEGER,"
                + "id_please INTEGER,"
                + "latitude REAL,"
                + "longitude REAL,"
                + "observed_on INTEGER,"
                + "observed_on_string TEXT,"
                + "place_guess TEXT,"
                + "positional_accuracy INTEGER,"
                + "private_latitude REAL,"
                + "private_longitude REAL,"
                + "private_positional_accuracy INTEGER,"
                + "quality_grade TEXT,"
                + "species_guess TEXT,"
                + "taxon_id INTEGER,"
                + "time_observed_at INTEGER,"
                + "updated_at INTEGER,"
                + "user_id INTEGER,"
                + "user_login TEXT"
                + ");";
    }
}
// END GENERATED BY /Users/kueda/projects/eclipse/workspace/iNaturalist/rails2android.rb AT Fri Dec 09 22:31:19 -0800 2011