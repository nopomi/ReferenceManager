import rm.controller.*
import rm.domain.*
import rm.repository.*
import rm.service.*

description 'User can view a list of references'

scenario "user can view a list of references", {
    given 'at least one entry is in the database'
    when 'user attempts to view the entry list'
    then 'a listing of references is displayed'
}

scenario "the references are displayed correctly", {
    given 'at least one entry is in the database'
    when 'user attempts to view the entry list'
    then 'all the available references are listed'
    and 'scandinavian characters are displayed correctly'
}

