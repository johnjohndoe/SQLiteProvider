
package novoda.lib.sqliteprovider.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.List;
import java.util.Map;

public class ExtendedSQLiteOpenHelper2 extends SQLiteOpenHelper implements IDatabaseMetaInfo {

    public ExtendedSQLiteOpenHelper2(Context context, String name, CursorFactory factory,
            int version) {
        super(context, name, factory, version);
    }

    @Override
    public Map<String, SQLiteType> getColumns(String table) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<String> getTables() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<String> getForeignTables(String table) {
        
        return null;
    }

    @Override
    public int getVersion() {
        return getReadableDatabase().getVersion();
    }

    @Override
    public void setVersion(int version) {
        getWritableDatabase().setVersion(version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}