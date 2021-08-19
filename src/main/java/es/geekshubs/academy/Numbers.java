package com.jferrus.enlace2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Numbers {

  /**
   * Apply Method
   * @param input
   * @return
   */
  public List<String> apply(final List<Integer> input) {
    
    Long numPositivos = input.stream().filter(numero -> numero > 0).count();
    Long numNegativos = input.stream().filter(numero -> numero < 0).count();
    Long numCeros = input.stream().filter(numero -> numero == 0).count();

    DecimalFormatSymbols simbolos = DecimalFormatSymbols.getInstance(Locale.ENGLISH);
    DecimalFormat df = new DecimalFormat("#0.0000", simbolos);
    
    String porcentajePositivos = df.format(numPositivos / (input.size() * 1.0f) );
    String porcentajeNegativos = df.format(numNegativos / (input.size() * 1.0f));
    String porcentajeCeros = df.format(numCeros / (input.size() * 1.0f));

    
    return Arrays.asList(porcentajePositivos, porcentajeNegativos, porcentajeCeros);
  }
  

}
