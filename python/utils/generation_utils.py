import random as rnd
import string

def random_int(min, max):
    return rnd.randint(min, max)

def random_float(min, max):
    return rnd.uniform(min, max)

def random_string(length):
    return ''.join(rnd.choice(string.ascii_uppercase + string.digits) for _ in range(length))

def random_int_array(length, min, max):
    return [random_int(min, max) for _ in range(0, length)]

def random_float_array(length, min, max):
    return [random_float(min, max) for _ in range(0, length)]

def random_string_array(length):
    return [random_string(length) for _ in range(0, length)]