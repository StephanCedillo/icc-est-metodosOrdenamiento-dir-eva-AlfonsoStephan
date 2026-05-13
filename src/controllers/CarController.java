package controllers;

import models.Car;

public class CarController {
  // burbuja avanzado
  public void sortByName(Car[] cars) {

    for (int i = 0; i < cars.length; i++) {
      boolean swap = false;
      for (int j = i; j < cars.length-1; j++) {
        if (cars[j].getName().compareTo(cars[j + 1].getName()) > 0) {
          Car aux = cars[j + 1];
          cars[j + 1] = cars[j];
          cars[j] = aux;
          swap = true;

        }

      }
      if (!swap) {
        break;

      }

    }

  }
}
