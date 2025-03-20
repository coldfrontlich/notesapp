import React, { useEffect, useState } from 'react'
import {getNotes, deleteNote} from '../api'
import NoteItem from './NoteItem'
import '../styles/NoteList.scss'

const NoteList = () => {
  const [notes, setNotes] = useState([])

  useEffect(() => {
    fetchNotes()
  }, [notes])

  const fetchNotes = async () => {
    const data = await getNotes();
    setNotes(data)
  }

  const handleDelete = async (id) => {
    await deleteNote(id);
    fetchNotes();
  };

  return (
		<div className='note-list'>
			<h2>Заметки</h2>
			{notes.map(note => (
				<NoteItem
					key={note.id}
					note={note}
					onDelete={handleDelete}
					onUpdate={fetchNotes}
				/>
			))}
		</div>
	)
}

export default NoteList
