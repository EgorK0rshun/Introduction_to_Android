package com.example.gettingstartedapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Item {
    String string;

    public Item(String string) {
        this.string = string;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + 1;
    }
}
