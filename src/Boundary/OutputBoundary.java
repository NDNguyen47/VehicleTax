package Boundary;

import dto.responseData;
import dto.responseError;

public interface OutputBoundary {
    void displayResult(responseData responseData);  
    void displayError(responseError responseError);         
}
