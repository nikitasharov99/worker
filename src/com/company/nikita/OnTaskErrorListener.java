package com.company.nikita;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String error);
}
