package dev.trabalhopicpay.controllers;

import dev.trabalhopicpay.dtos.requests.RequestTransaction;
import dev.trabalhopicpay.entitys.transaction.Transaction;
import dev.trabalhopicpay.services.TransactionService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/transaction")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TransactionController {

    @Inject
    TransactionService transactionService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createTransaction(RequestTransaction requestTransaction) throws Exception {
        Transaction createTransaction = transactionService.createTransaction(requestTransaction);
        return Response.status(Response.Status.CREATED).entity(createTransaction).build();
    }
}
