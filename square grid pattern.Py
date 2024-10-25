def square_grid(n):
    for i in range(n):
        for j in range(n):
            print("*", end=" ")
        print()  # Move to the next line after each row


size = 5 
square_grid(size)
