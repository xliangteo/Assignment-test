package com.example.test;

public class ReadMe {
    /*
    ALL OF THIS NEED TO COMBINE TOGETHER.
    Modal->place store the room list
    Room->activity_room.xml
    RoomFragment->fragment_room.xml
    RoomService->activity_room_service.xml
    RoomServiceFragment->fragment_room_service.xml

    ELSE IS CODE EXAMPLE ONLY WILL SHOW HERE ALSO SIMPLE COPY PASTE

    1 is example another is what nid to change

    Change Activity
    --------------------------------------------------------------
     button.setOnClickListener{
            val intent = Intent(this, Room::class.java)
            startActivity(intent)
        }

    [??button name??].setOnClickListener{
    val intent = Intent (this.context, [??class name(kt file)??]::class.java)
    startActivity(intent)
    }

    ===============================================================

     Change Activity and Bring data
    --------------------------------------------------------------
     button.setOnClickListener{
            var date = tvDate.text.toString()
            var room = tvRoom.text.toString()

            val intent = Intent(this, Room::class.java)
            intent.putExtra("Date", date)
            intent.putExtra("Room", room)
            startActivity(intent)
        }

   [??button name??].setOnClickListener{
            var [??variableWant??] = [variable in ady had in the file].text.toString()

            val intent = Intent (this.context, [??class name(kt file)??]::class.java)
            intent.putExtra("[??unique name will use for get data in other file??]", [??variableWant??])

            startActivity(intent)
        }

    ===============================================================

     Get data in other file
    --------------------------------------------------------------
     var intent = intent
        val date = intent.getStringExtra("Date")

     var intent = intent
        val [??variableWant??] = intent.[get Data's type]("unique name of that data")


     */
}
