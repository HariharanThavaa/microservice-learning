package microservices.book.socialmultiplication.service;

import microservices.book.socialmultiplication.domain.Multiplication;

public interface MultiplicationService {

    /**
     * Creates a Multiplication object with 2 randomly generated factors.
     * between 11 and 99
     *
     * @return a Multiplication object with random factors.
     */
    Multiplication createRandomMultiplication();
}
