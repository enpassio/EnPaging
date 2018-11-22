package com.enpassio.pagingsample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.enpassio.pagingsample.pagingwithitemkeyeddatasource.PagingWithItemKeyedDataSourceActivity;
import com.enpassio.pagingsample.pagingwithpagekeyeddatasource.PagingWithPageKeyedDataSourceActivity;
import com.enpassio.pagingsample.pagingwithpositionaldatasource.PagingWithPositionalDataSourceActivity;
import com.enpassio.pagingsample.pagingwithroom.PagingWithRoomActivity;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button itemKeyedButton;
    private Button pagedKeyedButton;
    private Button positionKeyedButton;
    private Button pagingWIthRoomButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itemKeyedButton = findViewById(R.id.button_item_keyed);
        pagedKeyedButton = findViewById(R.id.button_paged_keyed);
        positionKeyedButton = findViewById(R.id.button_position_keyed);
        pagingWIthRoomButton = findViewById(R.id.button_paging_with_room);

        //set onClick listeners on buttons
        itemKeyedButton.setOnClickListener(this);
        pagedKeyedButton.setOnClickListener(this);
        positionKeyedButton.setOnClickListener(this);
        pagingWIthRoomButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        // So we will make
        switch (view.getId() /*to get clicked view id**/) {
            case R.id.button_item_keyed:
                startActivity(new Intent(this, PagingWithItemKeyedDataSourceActivity.class));
                break;
            case R.id.button_paged_keyed:
                startActivity(new Intent(this, PagingWithPageKeyedDataSourceActivity.class));
                break;
            case R.id.button_position_keyed:
                startActivity(new Intent(this, PagingWithPositionalDataSourceActivity.class));
                break;
            case R.id.button_paging_with_room:
                startActivity(new Intent(this, PagingWithRoomActivity.class));
                break;
            default:
                break;
        }
    }
}
