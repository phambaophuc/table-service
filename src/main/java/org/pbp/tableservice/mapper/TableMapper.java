package org.pbp.tableservice.mapper;

import org.pbp.tableservice.dto.TableDto;
import org.pbp.tableservice.entity.DiningTable;

public interface TableMapper {

    static TableDto mapToDto(DiningTable table) {
        return TableDto.builder()
                .tableId(table.getTableId())
                .tableNumber(table.getTableNumber())
                .status(table.getStatus())
                .numberOfSeats(table.getNumberOfSeats())
                .build();
    }

    static DiningTable mapToTable(TableDto tableDto) {
        return DiningTable.builder()
                .tableId(tableDto.getTableId())
                .tableNumber(tableDto.getTableNumber())
                .status(tableDto.getStatus())
                .numberOfSeats(tableDto.getNumberOfSeats())
                .build();
    }
}
