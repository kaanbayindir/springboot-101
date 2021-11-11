package com.kaanbayindir.project.core.utilities.results;

public class ErrorDataResult<T> extends DataResult {
    public ErrorDataResult(T data, String message) {
        super(data,true,message);
    }

    public ErrorDataResult(T data) {
        super(true,data) ;
    }
    public ErrorDataResult(String message){
        super(true,null);
    }
    public ErrorDataResult(){
        super(true,null);
    }
}
