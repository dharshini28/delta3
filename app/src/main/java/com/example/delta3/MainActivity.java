package com.example.delta3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.support.v7.widget.SearchView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    ListView listView;
    ArrayList<String> items= new ArrayList<> ();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        final ListView listView = (ListView) findViewById ( R.id.lv );

        items.add ( "Avon and Somerset Constabulary" );
        items.add ( "Bedfordshire Police" );
        items.add ( "British Transport Police" );
        items.add ( "Cambridgeshire Constabulary" );
        items.add ( "Cheshire Constabulary" );
        items.add ( "City of London Police" );
        items.add ( "Cleveland Police" );
        items.add ( "Cumbria Constabulary" );
        items.add ( "Derbyshire Constabulary" );
        items.add ( "Devon & Cornwall Police" );
        items.add ( "Dorset Police" );
        items.add ( "Durham Constabulary" );
        items.add ( "Dyfed-Powys Police" );
        items.add ( "Essex Police" );
        items.add ( "Gloucestershire Constabulary" );
        items.add ( "Greater Manchester Police" );
        items.add ( "Gwent Police" );
        items.add ( "Hampshire Constabulary" );
        items.add ( "Hertfordshire Constabulary" );
        items.add ( "Humberside Police" );
        items.add ( "Kent Police" );
        items.add ( "Lancashire Constabulary" );
        items.add ( "Leicestershire Police" );
        items.add ( "Lincolnshire Police" );
        items.add ( "Merseyside Police" );
        items.add ( "Metropolitan Police Service" );
        items.add ( "Norfolk Constabulary" );
        items.add ( "North Wales Police" );
        items.add ( "North Yorkshire Police" );
        items.add ( "Northamptonshire Police" );
        items.add ( "Northumbria Police" );
        items.add ( "Nottinghamshire Police" );
        items.add ( "Police Service of Northern Ireland" );
        items.add ( "South Wales Police" );
        items.add ( "South Yorkshire Police" );
        items.add ( "Staffordshire Police" );
        items.add ( "Suffolk Constabulary" );
        items.add ( "Surrey Police" );
        items.add ( "Sussex Police" );
        items.add ( "Thames Valley Police" );
        items.add ( "Warwickshire Police" );
        items.add ( "West Mercia Police" );
        items.add ( "West Midlands Police" );
        items.add ( "West Yorkshire Police" );
        items.add ( "Wiltshire Police" );

        ArrayAdapter<String> adapter = new ArrayAdapter<> ( this, android.R.layout.simple_expandable_list_item_1, items );
        listView.setAdapter ( adapter );

        listView.setOnItemClickListener ( new AdapterView.OnItemClickListener () {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String text = listView.getItemAtPosition ( position ).toString ();
                Toast.makeText ( MainActivity.this, "" + text, Toast.LENGTH_SHORT ).show ();
                Intent intent = new Intent( MainActivity.this, MaainActivity.class);
                if (text.equals("Avon and Somerset Constabulary"))
                { intent.putExtra("force","avon-and-somerset");
                }
                if (text.equals("Bedfordshire Police"))
                { intent.putExtra("force","bedfordshire");
                }
                if (text.equals("British Transport Police"))
                { intent.putExtra("force","");
                }
                if (text.equals("Cambridgeshire Constabulary"))
                { intent.putExtra("force","cambridgeshire");
                }
                if (text.equals("Cheshire Constabulary"))
                { intent.putExtra("force","cheshire");
                }
                if (text.equals("City of London Police"))
                { intent.putExtra("force","city-of-london");
                }
                if (text.equals("Cleveland Police"))
                { intent.putExtra("force","cleveland");
                }
                if (text.equals("Cumbria Constabulary"))
                { intent.putExtra("force","cumbria");
                }
                if (text.equals("Derbyshire Constabulary"))
                { intent.putExtra("force","derbyshire");
                }
                if (text.equals("Devon & Cornwall Police"))
                { intent.putExtra("force","devon-and-cornwall");
                }
                if (text.equals("Dorset Police"))
                { intent.putExtra("force","dorset");
                }
                if (text.equals("Durham Constabulary"))
                { intent.putExtra("force","durham");
                }
                if (text.equals("Dyfed-Powys Police"))
                { intent.putExtra("force","dyfed-powys");
                }
                if (text.equals("Essex Police"))
                { intent.putExtra("force","essex");
                }
                if (text.equals("Gloucestershire Constabulary "))
                { intent.putExtra("force","gloucestershire");
                }
                if (text.equals("Greater Manchester Police"))
                { intent.putExtra("force","greater-manchester");
                }
                if (text.equals("Gwent Police"))
                { intent.putExtra("force","gwent");
                }
                if (text.equals("Hampshire Constabulary"))
                { intent.putExtra("force","hampshire");
                }
                if (text.equals("Hertfordshire Constabulary"))
                { intent.putExtra("force","hertfordshire");
                }
                if (text.equals("Humberside Police"))
                { intent.putExtra("force","Humberside Police");
                }
                if (text.equals("Kent Police"))
                { intent.putExtra("force","kent");
                }
                if (text.equals("Lancashire Constabulary"))
                { intent.putExtra("force","Lancashire");
                }
                if (text.equals("Leicestershire Police"))
                { intent.putExtra("force","leicestershire");
                }
                if (text.equals("Lincolnshire Police"))
                { intent.putExtra("force","lincolnshire");
                }
                if (text.equals("Merseyside Police"))
                { intent.putExtra("force","merseyside");
                }
                if (text.equals("Metropolitan Police Service"))
                { intent.putExtra("force","metropolitan");
                }
                if (text.equals("Norfolk Constabulary"))
                { intent.putExtra("force","norfolk");
                }
                if (text.equals("North Wales Police"))
                { intent.putExtra("force","north-wales");
                }
                if (text.equals("North Yorkshire Police"))
                { intent.putExtra("force","north-yorkshire");
                }
                if (text.equals("Northamptonshire Police"))
                { intent.putExtra("force","northamptonshire");
                }
                if (text.equals("Northumbria Police"))
                { intent.putExtra("force","northumbria");
                }
                if (text.equals("Nottinghamshire Police"))
                { intent.putExtra("force","nottinghamshire");
                }
                if (text.equals("Police Service of Northern Ireland")) {
                    intent.putExtra ( "force", "" );
                }
                if (text.equals("South Wales Police"))
                { intent.putExtra("force","south-wales");
                }
                if (text.equals("South Yorkshire Police"))
                { intent.putExtra("force","south-yorkshire");
                }
                if (text.equals("Staffordshire Police"))
                { intent.putExtra("force","staffordshire");
                }
                if (text.equals("Suffolk Constabulary"))
                { intent.putExtra("force","suffolk");
                }
                if (text.equals("Surrey Police"))
                { intent.putExtra("force","sussex");
                }
                if (text.equals("Sussex Police"))
                { intent.putExtra("force","");
                }
                if (text.equals("Thames Valley Police"))
                { intent.putExtra("force","thames-valley");
                }
                if (text.equals("Warwickshire Police"))
                { intent.putExtra("force","warwickshire");
                }
                if (text.equals("West Mercia Police"))
                { intent.putExtra("force","west-mercia");
                }
                if (text.equals("West Midlands Police"))
                { intent.putExtra("force","west-midlands");
                }
                if (text.equals("West Yorkshire Police"))
                { intent.putExtra("force","west-yorkshire");
                }
                if (text.equals("Wiltshire Police"))
                { intent.putExtra("force","wiltshire");
                }
                startActivity(intent);
            }
        } );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater ();
        inflater.inflate ( R.menu.menu, menu );

        MenuItem searchItem = menu.findItem ( R.id.item_search );
        SearchView s = (SearchView)searchItem.getActionView ();

        s.setOnQueryTextListener ( new SearchView.OnQueryTextListener () {

            @Override
            public boolean onQueryTextChange(String newText) {
            ArrayList<String> templist = new ArrayList<> ();

                for (String temp : items) {
                    if( temp.toLowerCase ().contains ( newText.toLowerCase () ) ) {
                        templist.add ( temp );
                    }
                }
                ArrayAdapter<String> adapter = new ArrayAdapter<> ( MainActivity.this, android.R.layout.simple_list_item_1, templist );
                listView.setAdapter ( adapter );
                return true;
            }

            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
}