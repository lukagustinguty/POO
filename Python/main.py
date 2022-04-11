from car import Car
if __name__ == "__main__":
    print("Hello Luciano")


    car = Car()
    car.driver = "Luciano Gutierrez"
    car.license = "PMP374"
    car.passegenger = 4

    print(vars(car))