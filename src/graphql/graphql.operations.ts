import { gql } from "apollo-angular"

export const GET_ALL_BOOKS = gql`
    query{
        allBooks{
            id,
            title,
            author{
                firstName,
                lastName
            }

        }
    }
` ;