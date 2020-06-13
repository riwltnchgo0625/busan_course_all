package com.example.busanapp.calendar;

import android.provider.BaseColumns;

class MemoContract {
    private MemoContract() {
    }

    static class MemoEntry implements BaseColumns {
        static final String TABLE_NAME = "memo";
        static final String DATE = "date";
        static final String COLUMN_NAME_TITLE = "title";
        static final String COLUMN_NAME_CONTENTS = "contents";
    }
}